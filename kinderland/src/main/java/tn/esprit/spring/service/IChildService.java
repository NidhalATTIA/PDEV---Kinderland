package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entity.Child;

public interface IChildService {
	public Child AddChild(Child admin);

	public List<Child> GetAllChildJPQL();

	public Child GetAdminById(Long adminId);

	public Child UpdateChild(Child admin);

	public void DeleteChild(Long adminId);
}
