package vistas;


import java.awt.CardLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import dto.*;
import javax.swing.*;

import logica.Logica;


public  class VistaPrincipal extends JFrame  {
	
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
		JPanel adminUser = new JPanel();
		JPanel adminTarjetas = new JPanel();
		JPanel adminCuentas = new JPanel();
		JPanel elegirUser = new JPanel();
		JPanel elegirTarjetas = new JPanel();
		JPanel elegirCuentas = new JPanel();
		JPanel crearCuenta = new JPanel();
		JPanel crearTarjeta = new JPanel();
		JPanel modificarTarjeta = new JPanel();
		JPanel crearUsuario = new JPanel();
		JPanel modificarUsuario = new JPanel();
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
		
		JLabel label2 = new JLabel("Introduzca las creedenciales de su tarjeta");
			label2.setSize(260, 30);
			label2.setLocation(140,150);
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
			label3.setSize(280, 30);
			label3.setLocation(125,150);
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
		historial.setEditable(false);
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
		
		//configuracion de la gestion de Tarjetas
		
		adminTarjetas.setVisible(true);
		adminTarjetas.setLayout(null);
		
		JButton borrarTarjetas = new JButton("Borrar Tarjeta");
		borrarTarjetas.setSize(150, 30);
		borrarTarjetas.setLocation(160,170);
		JButton modificarTarjetas = new JButton("Modificar Tarjeta");
		modificarTarjetas.setSize(150, 30);
		modificarTarjetas.setLocation(160,205);
		JButton crearTarjetas = new JButton("Crear Tarjeta");
		crearTarjetas.setSize(150, 30);
		crearTarjetas.setLocation(160,240);
		JButton volverUser5 = new JButton("Volver");
			volverUser5.setSize(120, 30);
			volverUser5.setLocation(30,420);
		
		adminTarjetas.add(borrarTarjetas);
		adminTarjetas.add(modificarTarjetas);
		adminTarjetas.add(crearTarjetas);
		adminTarjetas.add(volverUser5);
		
		//configuracion de la gestion de usuarios
		
		adminUser.setVisible(true);
		adminUser.setLayout(null);
		
		JButton borrarUser = new JButton("Borrar Usuario");
		borrarUser.setSize(150, 30);
		borrarUser.setLocation(160,170);
		JButton modificarUser = new JButton("Modificar Usuario");
		modificarUser.setSize(150, 30);
		modificarUser.setLocation(160,205);
		JButton crearUser = new JButton("Crear Usuario");
		crearUser.setSize(150, 30);
		crearUser.setLocation(160,240);
		JButton volverUser4 = new JButton("Volver");
		volverUser4.setSize(120, 30);
		volverUser4.setLocation(30,420);
		
		adminUser.add(borrarUser);
		adminUser.add(modificarUser);
		adminUser.add(crearUser);
		adminUser.add(volverUser4);
		//configuracion de la gestion de Cuentas
		
		adminCuentas.setVisible(true);
		adminCuentas.setLayout(null);
		
		JButton borrarCuentas = new JButton("Borrar Cuenta");
		borrarCuentas.setSize(150, 30);
		borrarCuentas.setLocation(160,170);
		JButton crearCuentas = new JButton("Crear Cuenta");
		crearCuentas.setSize(150, 30);
		crearCuentas.setLocation(160,205);
		JButton volverUser6 = new JButton("Volver");
		volverUser6.setSize(120, 30);
		volverUser6.setLocation(30,420);
		
		adminCuentas.add(borrarCuentas);
		adminCuentas.add(crearCuentas);
		adminCuentas.add(volverUser6);
		
		//selector de usuario a eliminar
		
		elegirUser.setVisible(true);
		elegirUser.setLayout(null);
		
		JLabel labelUser = new JLabel("Introduce el usuario");
		labelUser.setSize(250, 30);
		labelUser.setLocation(130,185);
		JTextField textUser = new JTextField(20);
		textUser.setSize(250,30);
		textUser.setLocation(130,220);
		JButton buttonUser = new JButton("Siguiente");
		buttonUser.setSize(160,30);
		buttonUser.setLocation(175,255);
		JButton volverUser7 = new JButton("Volver");
		volverUser7.setSize(120, 30);
		volverUser7.setLocation(30,420);
		
		elegirUser.add(labelUser);
		elegirUser.add(textUser);
		elegirUser.add(buttonUser);
		elegirUser.add(volverUser7);
		//selector de tarjeta a eliminar
		
		elegirTarjetas.setVisible(true);
		elegirTarjetas.setLayout(null);
		
		JLabel labelTarjeta = new JLabel("Introduce la tarjeta");
		labelTarjeta.setSize(250, 30);
		labelTarjeta.setLocation(130,185);
		JTextField textTarjeta = new JTextField(20);
		textTarjeta.setSize(250,30);
		textTarjeta.setLocation(130,220);
		JButton buttonTarjeta = new JButton("Siguiente");
		buttonTarjeta.setSize(160,30);
		buttonTarjeta.setLocation(175,255);
		JButton volverUser8 = new JButton("Volver");
		volverUser8.setSize(120, 30);
		volverUser8.setLocation(30,420);
		
		elegirTarjetas.add(labelTarjeta);
		elegirTarjetas.add(textTarjeta);
		elegirTarjetas.add(buttonTarjeta);
		elegirTarjetas.add(volverUser8);
		
	//selector de cuenta a eliminar
		
		elegirCuentas.setVisible(true);
		elegirCuentas.setLayout(null);
		
		JLabel labelCuenta = new JLabel("Introduce la cuenta");
		labelCuenta.setSize(250, 30);
		labelCuenta.setLocation(130,185);
		JTextField textCuenta = new JTextField(20);
		textCuenta.setSize(250,30);
		textCuenta.setLocation(130,220);
		JButton buttonCuenta = new JButton("Siguiente");
		buttonCuenta.setSize(160,30);
		buttonCuenta.setLocation(175,255);
		JButton volverUser9 = new JButton("Volver");
		volverUser9.setSize(120, 30);
		volverUser9.setLocation(30,420);
		
		elegirCuentas.add(labelCuenta);
		elegirCuentas.add(textCuenta);
		elegirCuentas.add(buttonCuenta);
		elegirCuentas.add(volverUser9);
		
		//creacion de una cuenta
		
		crearCuenta.setVisible(true);
		crearCuenta.setLayout(null);
		
		
		JLabel lCuenta = new JLabel("Numero de cuenta:");
		lCuenta.setSize(160,30);
		lCuenta.setLocation(170,135);
		JTextField tCuenta = new JTextField(20);
		tCuenta.setSize(180,30);
		tCuenta.setLocation(175,170);
		JLabel lSaldo = new JLabel("Saldo de la cuenta:");
		lSaldo.setSize(160,30);
		lSaldo.setLocation(170,215);
		JTextField tSaldo = new JTextField(20);
		tSaldo.setSize(180,30);
		tSaldo.setLocation(175,240);
		JButton bCCuenta = new JButton("Crear");
		bCCuenta.setSize(100,30);
		bCCuenta.setLocation(200,275);	
		JButton volverUser10= new JButton("Volver");
		volverUser10.setSize(120, 30);
		volverUser10.setLocation(30,420);
		
		crearCuenta.add(lCuenta);
		crearCuenta.add(tCuenta);
		crearCuenta.add(lSaldo);
		crearCuenta.add(tSaldo);
		crearCuenta.add(bCCuenta);
		crearCuenta.add(volverUser10);
		
		//Modificar una Tarjeta
		
		modificarTarjeta.setVisible(true);
		modificarTarjeta.setLayout(new GridLayout(6,2));
		JLabel modifT1 = new JLabel("Numero de la tarjeta a modificar:");
		JLabel modifT2 = new JLabel("Limite_Diario:");
		JLabel modifT3 = new JLabel("Limite_mensual:");
		JLabel modifT4 = new JLabel("Pin:");
		JLabel modifT5 = new JLabel("Tipo:");
		JButton volverUser11= new JButton("Volver");
		
		JTextField modifTT1 = new JTextField(15);
		JTextField modifTT2 = new JTextField(15);
		JTextField modifTT3 = new JTextField(15);
		JTextField modifTT4 = new JTextField(15);
		JTextField modifTT5 = new JTextField(15);
		JButton modifTB = new JButton("Modificar");
		
		modificarTarjeta.add(modifT1);
		modificarTarjeta.add(modifTT1);
		modificarTarjeta.add(modifT2);
		modificarTarjeta.add(modifTT2);
		modificarTarjeta.add(modifT3);
		modificarTarjeta.add(modifTT3);
		modificarTarjeta.add(modifT4);
		modificarTarjeta.add(modifTT4);
		modificarTarjeta.add(modifT5);	
		modificarTarjeta.add(modifTT5);
		modificarTarjeta.add(volverUser11);
		modificarTarjeta.add(modifTB);
		
		//crear una Tarjeta
		
		crearTarjeta.setVisible(true);
		crearTarjeta.setLayout(new GridLayout(8,2));
		JLabel crearT1 = new JLabel("Numero:");
		JLabel crearT2 = new JLabel("Limite_Diario:");
		JLabel crearT3 = new JLabel("Limite_mensual:");
		JLabel crearT4 = new JLabel("Pin:");
		JLabel crearT5 = new JLabel("Tipo:");
		JLabel crearT6 = new JLabel("Cuenta:");
		JLabel crearT7 = new JLabel("Cliente:");
		JButton volverUser12= new JButton("Volver");
		
		JTextField crearTT1 = new JTextField(15);
		JTextField crearTT2 = new JTextField(15);
		JTextField crearTT3 = new JTextField(15);
		JTextField crearTT4 = new JTextField(15);
		JTextField crearTT5 = new JTextField(15);
		JTextField crearTT6 = new JTextField(15);
		JTextField crearTT7 = new JTextField(15);
		JButton crearTB = new JButton("Crear");
		
		crearTarjeta.add(crearT1);
		crearTarjeta.add(crearTT1);
		crearTarjeta.add(crearT2);
		crearTarjeta.add(crearTT2);
		crearTarjeta.add(crearT3);
		crearTarjeta.add(crearTT3);
		crearTarjeta.add(crearT4);
		crearTarjeta.add(crearTT4);
		crearTarjeta.add(crearT5);	
		crearTarjeta.add(crearTT5);
		crearTarjeta.add(crearT6);	
		crearTarjeta.add(crearTT6);
		crearTarjeta.add(crearT7);	
		crearTarjeta.add(crearTT7);
		crearTarjeta.add(volverUser12);
		crearTarjeta.add(crearTB);
		
		//modificar un usuario
		
		modificarUsuario.setVisible(true);
		modificarUsuario.setLayout(new GridLayout(9,2));
		JLabel modificarU1 = new JLabel("DNI del user a modificar:");
		JLabel modificarU2 = new JLabel("Contraseña:");
		JLabel modificarU3 = new JLabel("Nombre:");
		JLabel modificarU4 = new JLabel("Apellido1:");
		JLabel modificarU5 = new JLabel("Apellido2:");
		JLabel modificarU6 = new JLabel("Telefono:");
		JLabel modificarU7 = new JLabel("Direccion:");
		JLabel modificarU8 = new JLabel("Email:");
		JButton volverUser13= new JButton("Volver");
		
		JTextField modificarUT1 = new JTextField(15);
		JTextField modificarUT2 = new JTextField(15);
		JTextField modificarUT3 = new JTextField(15);
		JTextField modificarUT4 = new JTextField(15);
		JTextField modificarUT5 = new JTextField(15);
		JTextField modificarUT6 = new JTextField(15);
		JTextField modificarUT7 = new JTextField(15);
		JTextField modificarUT8 = new JTextField(15);
		JButton modificarUB = new JButton("Modificar");
		
		modificarUsuario.add(modificarU1);
		modificarUsuario.add(modificarUT1);
		modificarUsuario.add(modificarU2);
		modificarUsuario.add(modificarUT2);
		modificarUsuario.add(modificarU3);
		modificarUsuario.add(modificarUT3);
		modificarUsuario.add(modificarU4);
		modificarUsuario.add(modificarUT4);
		modificarUsuario.add(modificarU5);	
		modificarUsuario.add(modificarUT5);
		modificarUsuario.add(modificarU6);	
		modificarUsuario.add(modificarUT6);
		modificarUsuario.add(modificarU7);	
		modificarUsuario.add(modificarUT7);
		modificarUsuario.add(modificarU8);	
		modificarUsuario.add(modificarUT8);
		modificarUsuario.add(volverUser13);
		modificarUsuario.add(modificarUB);
		
		//crear un usuario
		
		crearUsuario.setVisible(true);
		crearUsuario.setLayout(new GridLayout(9,2));
		JLabel crearU1 = new JLabel("DNI:");
		JLabel crearU2 = new JLabel("Contraseña:");
		JLabel crearU3 = new JLabel("Nombre:");
		JLabel crearU4 = new JLabel("Apellido1:");
		JLabel crearU5 = new JLabel("Apellido2:");
		JLabel crearU6 = new JLabel("Telefono:");
		JLabel crearU7 = new JLabel("Direccion:");
		JLabel crearU8 = new JLabel("Email:");
		JButton volverUser14= new JButton("Volver");
		
		JTextField crearUT1 = new JTextField(15);
		JTextField crearUT2 = new JTextField(15);
		JTextField crearUT3 = new JTextField(15);
		JTextField crearUT4 = new JTextField(15);
		JTextField crearUT5 = new JTextField(15);
		JTextField crearUT6  = new JTextField(15);
		JTextField crearUT7 = new JTextField(15);
		JTextField crearUT8 = new JTextField(15);
		JButton crearUB = new JButton("Crear");
		
		crearUsuario.add(crearU1);
		crearUsuario.add(crearUT1);
		crearUsuario.add(crearU2);
		crearUsuario.add(crearUT2);
		crearUsuario.add(crearU3);
		crearUsuario.add(crearUT3);
		crearUsuario.add(crearU4);
		crearUsuario.add(crearUT4);
		crearUsuario.add(crearU5);	
		crearUsuario.add(crearUT5);
		crearUsuario.add(crearU6);	
		crearUsuario.add(crearUT6);
		crearUsuario.add(crearU7);	
		crearUsuario.add(crearUT7);
		crearUsuario.add(crearU8);	
		crearUsuario.add(crearUT8);
		crearUsuario.add(volverUser14);
		crearUsuario.add(crearUB);
		
		
		
		
		
		c.add(panel,"panel");
		c.add(sesion,"sesion");
		c.add(sesionAdmin,"sesionAdmin");
		c.add(usuario,"usuario");
		c.add(admin,"admin");
		c.add(vistaIngresar,"ingresar");
		c.add(vistaRetirar,"retirar");
		c.add(cambiarPin,"pin");
		c.add(adminUser,"adminUser");
		c.add(adminCuentas,"adminCuentas");
		c.add(adminTarjetas,"adminTarjetas");
		c.add(elegirUser,"elegirUser");
		c.add(elegirTarjetas,"elegirTarjetas");
		c.add(elegirCuentas,"elegirCuentas");
		c.add(crearCuenta,"crearCuenta");
		c.add(modificarTarjeta,"modificarTarjeta");
		c.add(crearTarjeta,"crearTarjeta");
		c.add(modificarUsuario,"modificarUser");
		c.add(crearUsuario,"crearUser");
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
			public void actionPerformed(ActionEvent e)  {
				
				if(l.checkLogin(nombreUser.getText(), contrasena.getPassword())) {
					l.mostrarSaldo(saldo,nombreUser.getText());
					l.mostrarHistorial(historial);
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
		volverUser4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(c, "admin");
				
			}
			
		});
		
		volverUser5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(c, "admin");
				
			}
			
		});
		volverUser6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(c, "admin");
				
			}
			
		});
		
		volverUser7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(c, "adminUser");
				
			}
			
		});
		volverUser8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(c, "adminTarjetas");
				
			}
			
		});
		volverUser9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(c, "adminCuentas");
				
			}
			
		});
		volverUser10.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(c, "adminCuentas");
				
			}
			
		});
		
		volverUser11.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(c, "adminTarjetas");
				
			}
			
		});
		volverUser12.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(c, "adminTarjetas");
				
			}
			
		});
		
		volverUser13.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(c, "adminUser");
				
			}
			
		});
		volverUser14.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(c, "adminUser");
				
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
		
		adminU.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(c, "adminUser");
				
			}
			
		});
		adminT.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(c, "adminTarjetas");
				
			}
			
		});
		adminCu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(c, "adminCuentas");
				
			}
			
		});
		borrarUser.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(c, "elegirUser");
				
			}
			
		});
		modificarUser.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(c, "modificarUser");
				
			}
			
		});
		borrarTarjetas.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(c, "elegirTarjetas");
				
			}
			
		});
		modificarTarjetas.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				
			}
			
		});
		borrarCuentas.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				cl.show(c, "elegirCuentas");
				
				
			}
			
		});
		
		buttonCuenta.addActionListener(new ActionListener() {
			

			@Override
			public void actionPerformed(ActionEvent e) {
				if(l.borrarCuenta(textCuenta.getText())) {
					JOptionPane.showMessageDialog(new JFrame(), "Cuenta borrada con exito");			
					}else JOptionPane.showMessageDialog(new JFrame(), "Error al borrar la cuenta, introduzcalo de nuevo");			
			}
		});
		buttonTarjeta.addActionListener(new ActionListener() {
			

			@Override
			public void actionPerformed(ActionEvent e) {
				if(l.borrarTarjeta(textTarjeta.getText())) {
					JOptionPane.showMessageDialog(new JFrame(), "Tarjeta borrada con exito");			
					}else JOptionPane.showMessageDialog(new JFrame(), "Error al borrar la Tarjeta, introduzcalo de nuevo");			
			}
		});
		buttonUser.addActionListener(new ActionListener() {
			

			@Override
			public void actionPerformed(ActionEvent e) {
				if(l.borrarUser(textUser.getText())) {
					JOptionPane.showMessageDialog(new JFrame(), "Usuario borrado con exito");			
					}else JOptionPane.showMessageDialog(new JFrame(), "Error al borrar el usuario, introduzcalo de nuevo");			
			}
		});
		crearCuentas.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(c, "crearCuenta");
				
			}
			
		});
		
		modificarTarjetas.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(c, "modificarTarjeta");
				
			}
			
		});
		crearTarjetas.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(c,"crearTarjeta");
			}
			
		});
		
		crearUser.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(c, "crearUser");
				
			}
			
		});
		
		modifTB.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(l.modificarTarjeta(modifTT1.getText(),modifTT2.getText(),modifTT3.getText(),modifTT4.getText(),modifTT5.getText())){
					JOptionPane.showMessageDialog(new JFrame(), "Se ha modificado la tarjeta");
				}else JOptionPane.showMessageDialog(new JFrame(), "Error al modificar la tarjeta, introduzcalo de nuevo");
				
				
			}
			
		});
		
		crearTB.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(l.crearTarjeta(crearTT1.getText(),crearTT2.getText(),crearTT3.getText(),crearTT4.getText(),crearTT5.getText(),crearTT6.getText(),crearTT7.getText() )) {
					JOptionPane.showMessageDialog(new JFrame(), "Se ha creado la tarjeta");
					}else JOptionPane.showMessageDialog(new JFrame(), "Error al crear la tarjeta, introduzcalo de nuevo");
				
			}
			
		});
		crearUB.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				UsuarioDTO us = new UsuarioDTO(crearUT3.getText(),crearUT4.getText(),crearUT5.getText(),crearUT6.getText(),crearUT8.getText(),crearUT7.getText(),crearUT1.getText(),crearUT2.getText());
				if(l.crearUser(us)) {
					JOptionPane.showMessageDialog(new JFrame(), "Se ha creado el usuario");
				}else JOptionPane.showMessageDialog(new JFrame(), "Error al crear el usuario, introduzcalo de nuevo");
				
			}
			
		});
		
		modificarUB.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(l.modificarUser(modificarUT3.getText(),modificarUT4.getText(),modificarUT5.getText(),modificarUT6.getText(),modificarUT8.getText(),modificarUT7.getText(),modificarUT1.getText(),modificarUT2.getText())) {
				JOptionPane.showMessageDialog(new JFrame(), "Se ha modificado el usuario");
			}else JOptionPane.showMessageDialog(new JFrame(), "Error al modificar el usuario, introduzcalo de nuevo");
			}
			
		});
		bCCuenta.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				if(l.crearCuenta(tCuenta.getText(),tSaldo.getText())){
				JOptionPane.showMessageDialog(new JFrame(), "Se ha creado la cuenta");
			}else JOptionPane.showMessageDialog(new JFrame(), "Error al crear la cuenta, introduzcalo de nuevo");
			}
		});
		
		
	}
	

}
