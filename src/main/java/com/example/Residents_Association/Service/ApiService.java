package com.example.Residents_Association.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.Residents_Association.Entity.Resident;
import com.example.Residents_Association.Repository.ResidentRepo;

@Service
public class ApiService {
	@Autowired
	private ResidentRepo rr;
	
	public Resident savedetails(Resident r) {
		return rr.save(r);
	}
	
	public List<Resident> findall(int pgno,int pgsize){
		PageRequest pg=PageRequest.of(pgno, pgsize);
		Page<Resident> pageresult=rr.findAll(pg);
		return pageresult.toList();
	}
	public boolean deleteCaseById(int id) {
		try {
			rr.deleteById(id);
		}
		catch(Exception e){
			e.printStackTrace();
			return false;
		}
		return true;
	}
	public Resident CaseById(int id,Resident r) {
		Resident res=rr.findById(id).orElse(null);
		
		res.setId(r.getId());
		res.setName(r.getName());
		res.setHname(r.getHname());
		res.setSname(r.getSname());
		res.setDob(r.getDob());
		res.setOname(r.getOname());
		res.setMob(r.getMob());
		res.setMail(r.getMail());
		return rr.save(res);
		
		
	}
	public Resident updateResidentById(int id,Resident r) {
		r.setId(id);
		return rr.saveAndFlush(r);
		
	}

	public boolean deleteResidentById(int id) {
		try{			
			rr.deleteById(id);
		}
		catch(Exception e) {
			System.out.println(e);
			return false;
		}
		return true;
		
	}

	public List<Resident> getAllDetails() {
		return rr.findAll();
	}



	


}
