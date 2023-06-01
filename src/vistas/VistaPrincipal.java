package vistas;


import java.awt.CardLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import logica.Logica;


public  class VistaPrincipal extends JFrame {
	
	public VistaPrincipal() {
		
		JFrame frame= new JFrame();
		Logica l = new Logica();
		
		Container c = frame.getContentPane();
		CardLayout cl = new CardLayout();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(cl);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		
		
		JPanel panel = new JPanel();
		JPanel sesion = new JPanel();
		JPanel sesionAdmin = new JPanel();
		JPanel usuario = new JPanel();
		JPanel admin = new JPanel();
		JPanel vistaIngresar = new JPanel();
		JPanel vistaRetirar = new JPanel();
		JPanel cambiarPin = new JPanel();
		
		//configuracion y añadir elementos de la ventana principal
		panel.setLayout(null);
		panel.setVisible(true);
		
		
		JButton iniciarUser = new JButton("Iniciar Usuario");
			iniciarUser.setSize(150,30);
			iniciarUser.setLocation(80, 245);
		JButton iniciarAdmin = new JButton("Iniciar Admin");
			iniciarAdmin.setSize(150,30);
			iniciarAdmin.setLocation(240,245);
		JLabel label = new JLabel("Bienvenido al banco DAW");
			label.setSize(220,30);
			label.setLocation(175, 210);
		panel.add(label);
		panel.add(iniciarUser);
		panel.add(iniciarAdmin);
		
		//configuracion y añadir elementos de la ventana de inicio de sesion para usuarios
			sesion.setLayout(null);
			sesion.setVisible(true);
		
		JLabel label2 = new JLabel("Introduzca sus creedenciales");
			label2.setSize(220, 30);
			label2.setLocation(170,150);
		JTextField nombreUser = new JTextField(15);
			nombreUser.setSize(220, 30);
			nombreUser.setLocation(150,185);
		JPasswordField contrasena = new JPasswordField(15);
			contrasena.setSize(220, 30);
			contrasena.setLocation(150,220);
		JButton iniciarS = new JButton("Entrar");
			iniciarS.setSize(150,30);
			iniciarS.setLocation(175,255);
		
		
		sesion.add(label2);
		sesion.add(nombreUser);
		sesion.add(contrasena);
		sesion.add(iniciarS);
		
		//configuracion y añadir elementos de la ventana de inicio de sesion para admins
		
		sesionAdmin.setVisible(true);
		sesionAdmin.setLayout(null);
		

		JLabel label3 = new JLabel("Introduzca sus creedenciales de administrador");
			label3.setSize(220, 30);
			label3.setLocation(130,150);
		JTextField nombreAdmin = new JTextField(15);
			nombreAdmin.setSize(220, 30);
			nombreAdmin.setLocation(150,185);
		JPasswordField contrasenaAdmin = new JPasswordField(15);
			contrasenaAdmin.setSize(220, 30);
			contrasenaAdmin.setLocation(150,220);
		JButton iniciarSAdmin = new JButton("Entrar");
			iniciarSAdmin.setSize(150,30);
			iniciarSAdmin.setLocation(175,255);
		
		sesionAdmin.add(label3);
		sesionAdmin.add(nombreAdmin);
		sesionAdmin.add(contrasenaAdmin);
		sesionAdmin.add(iniciarSAdmin);
		
		
		//configuracion y añadir elementos de la vista de usuario
		
			usuario.setLayout(new GridLayout(1,2));
			usuario.setVisible(true);
		JPanel datosUser = new JPanel();
		JTextArea historial = new JTextArea();
		usuario.add(datosUser);
		usuario.add(historial);
		
			datosUser.setLayout(new GridLayout(2,1));
		JPanel arribaizq = new JPanel();
		JPanel funcionesUser = new JPanel();
			datosUser.add(arribaizq);
			datosUser.add(funcionesUser);
		
			arribaizq.setLayout(new GridLayout(2,1));
		JLabel saldo= new JLabel();
		JButton cerrarSesion = new JButton("Cerrar Sesion");
 			arribaizq.add(saldo);
 			arribaizq.add(cerrarSesion);
			funcionesUser.setLayout(new GridLayout(3,1));
		JButton retirar = new JButton("Retirar");
		JButton ingresar = new JButton("Ingresar");
		JButton pin = new JButton("Cambiar PIN");
		funcionesUser.add(retirar);
		funcionesUser.add(ingresar);
		funcionesUser.add(pin);
		
		
		//Ventana de funcionalidad Ingresar dinero
		vistaIngresar.setVisible(true);
		vistaIngresar.setLayout(null);
		
		JLabel ingreso = new JLabel("Introduzca la cantidad a Ingresar");
			ingreso.setSize(220, 30);
			ingreso.setLocation(170,150);		
		JTextField cantidadI = new JTextField(15);
			cantidadI.setSize(220, 30);
			cantidadI.setLocation(150,185);
		JButton bIngresar = new JButton("Ingresar");
			bIngresar.setSize(150, 30);
			bIngresar.setLocation(175,220);
		JLabel resultadoI = new JLabel();
			resultadoI.setSize(260, 30);
			resultadoI.setLocation(130,255);
		JButton volverUser = new JButton("Volver");
			volverUser.setSize(120, 30);
			volverUser.setLocation(30,420);
		vistaIngresar.add(ingreso);
		vistaIngresar.add(cantidadI);
		vistaIngresar.add(bIngresar);
		vistaIngresar.add(resultadoI);
		vistaIngresar.add(volverUser);
		
		//Ventana de funcionalidad Retirar dinero
		vistaRetirar.setVisible(true);
		vistaRetirar.setLayout(null);
		
		JLabel retiro = new JLabel("Introduzca la cantidad a Retirar");
			retiro.setSize(220, 30);
			retiro.setLocation(170,150);		
		JTextField cantidadR = new JTextField(15);
			cantidadR.setSize(220, 30);
			cantidadR.setLocation(150,185);
		JButton bRetirar = new JButton("Retirar");
			bRetirar.setSize(150, 30);
			bRetirar.setLocation(175,220);
		JLabel resultadoR = new JLabel();
			resultadoR.setSize(260, 30);
			resultadoR.setLocation(130,255);
		JButton volverUser2 = new JButton("Volver");
			volverUser2.setSize(120, 30);
			volverUser2.setLocation(30,420);
		vistaRetirar.add(retiro);
		vistaRetirar.add(cantidadR);
		vistaRetirar.add(bRetirar);
		vistaRetirar.add(resultadoR);
		vistaRetirar.add(volverUser2);
		
			
		//configuracion y ventana de cambiar pin
		cambiarPin.setVisible(true);
		cambiarPin.setLayout(null);
		JLabel labelPin = new JLabel("Introduzca su nuevo pin");
			labelPin.setSize(220, 30);
			labelPin.setLocation(170,150);		
		JTextField pin1 = new JTextField(15);
			pin1.setSize(220, 30);
			pin1.setLocation(130,185);
		JTextField pin2 = new JTextField(15);
			pin2.setSize(220, 30);
			pin2.setLocation(130,220);
		JButton bPin = new JButton("Cambiar Pin");	
			bPin.setSize(150, 30);
			bPin.setLocation(175,255);
		JLabel resultadoPin = new JLabel();
			resultadoPin.setSize(220, 30);
			resultadoPin.setLocation(11500,290);
		JButton volverUser3 = new JButton("Volver");
			volverUser3.setSize(120, 30);
			volverUser3.setLocation(30,420);
		cambiarPin.add(labelPin);
		cambiarPin.add(pin1);
		cambiarPin.add(pin2);
		cambiarPin.add(bPin);
		cambiarPin.add(resultadoPin);
		cambiarPin.add(volverUser3);
	
		
		//configuracion y añadir elementos de la vista de administrador
		admin.setVisible(true);
		admin.setLayout(null);	
		
		JButton adminCu = new JButton("Administrar Cuentas");
			adminCu.setSize(220, 30);
			adminCu.setLocation(150,150);
		
		JButton adminT = new JButton("Administrar Tarjetas");
			adminT.setSize(220, 30);
			adminT.setLocation(150,185);
		
		JButton adminU = new JButton("Administrar Usuarios");
			adminU.setSize(220, 30);
			adminU.setLocation(150,220);
		
		JButton apagar = new JButton("Apagar");
			apagar.setSize(220,30);
			apagar.setLocation(150,255);
		
		JButton reiniciar = new JButton("Reiniciar");
			reiniciar.setSize(220, 30);
			reiniciar.setLocation(150,290);
		
		JButton volver = new JButton("Cerrar Sesion");
			volver.setSize(120, 30);
			volver.setLocation(30,420);

		admin.add(adminU);
		admin.add(adminT);
		admin.add(adminCu);
		admin.add(reiniciar);
		admin.add(apagar);
		admin.add(volver);
		
		
		c.add(panel,"panel");
		c.add(sesion,"sesion");
		c.add(sesionAdmin,"sesionAdmin");
		c.add(usuario,"usuario");
		c.add(admin,"admin");
		c.add(vistaIngresar,"ingresar");
		c.add(vistaRetirar,"retirar");
		c.add(cambiarPin,"pin");
		//configuracion de las acciones de los botones
		iniciarUser.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cl.next(c);	
			}	
		});
		
		iniciarAdmin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(c,"sesionAdmin");
				
			}
			
		});
		
		iniciarS.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(l.checkLogin(nombreUser.getText(), contrasena.getPassword())) {
					cl.show(c,"usuario");
				}else {
					JOptionPane.showMessageDialog(new JFrame(), "Error de inicio de sesion pruebe de nuevo");
				}
			
			}
		});
		
		iniciarSAdmin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(l.checkLoginAdmin(nombreAdmin.getText(), contrasenaAdmin.getPassword())) {
					cl.show(c,"admin");
				}else {
					JOptionPane.showMessageDialog(new JFrame(), "Error de inicio de sesion, introduzca los datos correctos o quizas no eres administrador");
				}
				
			}
			
		});
		
		apagar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				
			}
			
		});
		reiniciar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				VistaPrincipal v = new VistaPrincipal();
				
				
			}
			
		});
		volver.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(c,"panel");
				
			}
			
		});
		
		cerrarSesion.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(c,"panel");
				
			}
			
		});
		
		ingresar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(c, "ingresar");
				
			}
			
		});
		bIngresar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(Integer.parseInt(cantidadI.getText())%10==0){
				resultadoI.setText("El dinero ha sido ingresado con exito");
			}else {
				resultadoI.setText("Introduzca solo billetes en multiplos de 10");
			}
			}
		});
		volverUser.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(c, "usuario");
				
			}
			
		});
		volverUser2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(c, "usuario");
				
			}
			
		});
		volverUser3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(c, "usuario");
				
			}
			
		});
		
		
		
		retirar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(c,"retirar");
				
			}
			
		});
		
		bRetirar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(l.comprobarSaldo(nombreUser.getText(),cantidadR.getText())){
				resultadoR.setText("El dinero ha sido retirado con exito");
			}else {
				resultadoR.setText("Error, saldo insuficiente");
			}
			}
		});
		
		pin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(c, "pin");
			
				
			}
			
		});
		
		
	}
	

}
