package ui;


import java.util.LinkedList;
import java.util.Scanner;

import entities.*;
import logic.Login;
import logic.RolLogic;

public class Menu {
	Scanner s=null;
	Login ctrlLogin = new Login();
	RolLogic rolLogic = new RolLogic();

	public void start() {
		s = new Scanner(System.in);
		Persona p=login();
		System.out.println("Bienvenido "+p.getNombre()+" "+p.getApellido());
		System.out.println();
		
		String command;
		do {
			command=getCommand();
			executeCommand(command);
			System.out.println();
			
		}while(!command.equalsIgnoreCase("exit"));
		
		s.close();
	}

	private void executeCommand(String command) {
		switch (command) {
		case "list":
			System.out.println(ctrlLogin.getAll());
			break;
		case "find":
			System.out.println(find());
			break;
		case "search":
			System.out.println(search());
			break;
		case "new":
			System.out.println(add());
			break;
		case "edit":
			
			break;
		case "delete":
			
			break;
		default:
			break;
		}
	}

	private String getCommand() {
		System.out.println("Ingrese el comando segun la opcion que desee realizar");
		System.out.println("list\t\tlistar todos");
		System.out.println("find\t\tbuscar por tipo y nro de documento"); //solo debe devolver 1
		System.out.println("search\t\tlistar por apellido"); //puede devolver varios
		System.out.println("new\t\tcrea una nueva persona y asigna un rol existente");
		System.out.println("edit\t\tbusca por tipo y nro de documento y actualiza todos los datos");
		System.out.println("delete\t\tborra por tipo y nro de documento");
		System.out.println();
		System.out.print("comando: ");
		return s.nextLine();
	}
	
	public Persona login() {
		Persona p=new Persona();
		
		System.out.print("Email: ");
		p.setEmail(s.nextLine());

		System.out.print("password: ");
		p.setPassword(s.nextLine());
		
		p=ctrlLogin.validate(p);
		
		return p;
		
	}
	
	private Persona find() {
		System.out.println();
		Persona p=new Persona();
		Documento d=new Documento();
		p.setDocumento(d);
		System.out.print("Tipo doc: ");
		d.setTipo(s.nextLine());

		System.out.print("Nro doc: ");
		d.setNro(s.nextLine());
		
		return ctrlLogin.getByDocumento(p);
	}
	
	private LinkedList<Persona> search(){
		System.out.println();
		Persona p = new Persona();
		Documento d = new Documento();
		p.setDocumento(d);
		System.out.println("Apellido:");
		p.setApellido(s.nextLine());
		
		return ctrlLogin.getByApellido(p);
	}

	private Persona add() {
		Persona p = new Persona();
		Documento d = new Documento();
		Rol r = new Rol();
		
		System.out.print("Ingrese Nombre: ");
		p.setNombre(s.nextLine());
		System.out.print("Ingrese Apellido: ");
		p.setApellido(s.nextLine());
		System.out.print("Ingrese Numero de Documento: ");
		d.setNro(s.nextLine());
		System.out.print("Ingrese Tipo de Documento: ");
		d.setTipo(s.nextLine());
		
		p.setDocumento(d);
		
		System.out.print("Ingrese Email: ");
		p.setEmail(s.nextLine());
		System.out.print("Ingrese Password: ");
		p.setPassword(s.nextLine());
		System.out.print("Ingrese Nro de Telefono: ");
		p.setTel(s.nextLine());
		System.out.print("�Esta habilitado? (S o N): ");
		p.setHabilitado(s.nextLine().equalsIgnoreCase("S"));
		
		System.out.println();
		
		String respuesta;
		do {
			System.out.print("�Desea agregar algun rol? (S o N): ");
			respuesta = s.nextLine();
			
			if (respuesta.equalsIgnoreCase("S")) {
				System.out.println(rolLogic.getAll());
				System.out.println();
				
				System.out.print("Elija un rol a agregar: ");
				r.setId(Integer.parseInt(s.nextLine()));
				rolLogic.getByID(r);
				
				p.addRol(r);
			}
		}while (respuesta.equalsIgnoreCase("S"));
		
		ctrlLogin.add(p);
		rolLogic.saveRoles(p);
		
		return p;
	}
}
