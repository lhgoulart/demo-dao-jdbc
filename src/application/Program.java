package application;

import java.util.List;

import model.dao.DAOFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDAO sellerDAO = DAOFactory.createSellerDAO();
		
		System.out.println("--- Teste 1: seller findById ---");
		Seller seller = sellerDAO.findById(3);
		System.out.println(seller);
		
		System.out.println("\n--- Teste 2: seller findByDepartment ---");
		List<Seller> list = sellerDAO.findByDepartment(new Department(2,null));
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n--- Teste 3: seller findAll ---");
		list = sellerDAO.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}

		
	} // end main

	
} // end Program
