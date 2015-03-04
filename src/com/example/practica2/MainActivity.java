package com.example.practica2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.*;
import android.widget.*;


public class MainActivity extends ActionBarActivity implements OnClickListener {

	Double[] numeroObtenido = new Double[20];
	Double resultado;
	
	boolean decimal = false;
	
	boolean suma = false;
	boolean resta = false;
	boolean multiplicacion = false;
	boolean division = false;
	
	boolean raiz = false;
	boolean seno = false;
	boolean coseno = false;
	boolean tangente = false;
	boolean log = false;
	boolean exponencial = false;
	
	boolean igual = false;
	
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //Botones del 0 al 9
        Button btn_0 = (Button) findViewById(R.id.btn_0);
       btn_0.setOnClickListener(this);
       Button btn_1 = (Button) findViewById(R.id.btn_1);
       btn_1.setOnClickListener(this);
       Button btn_2 = (Button) findViewById(R.id.btn_2);
       btn_2.setOnClickListener(this);
       Button btn_3 = (Button) findViewById(R.id.btn_3);
       btn_3.setOnClickListener(this);
       Button btn_4 = (Button) findViewById(R.id.btn_4);
       btn_4.setOnClickListener(this);
       Button btn_5 = (Button) findViewById(R.id.btn_5);
       btn_5.setOnClickListener(this);
       Button btn_6 = (Button) findViewById(R.id.btn_6);
       btn_6.setOnClickListener(this);
       Button btn_7 = (Button) findViewById(R.id.btn_7);
       btn_7.setOnClickListener(this);
       Button btn_8 = (Button) findViewById(R.id.btn_8);
       btn_8.setOnClickListener(this);
       Button btn_9 = (Button) findViewById(R.id.btn_9);
       btn_9.setOnClickListener(this);
       
       //Botones de limpiar pantalla
       Button btn_limpiar = (Button) findViewById(R.id.btn_limpiar);
       btn_limpiar.setOnClickListener(this);
       Button btn_borrar = (Button) findViewById(R.id.btn_borrar);
       btn_borrar.setOnClickListener(this);
      
        //botones de operaciones
       Button btn_raiz = (Button) findViewById(R.id.btn_raiz);
       btn_raiz.setOnClickListener(this);
       Button btn_division = (Button) findViewById(R.id.btn_division);
       btn_division.setOnClickListener(this);
       Button btn_multiplicacion = (Button) findViewById(R.id.btn_multiplicacion);
       btn_multiplicacion.setOnClickListener(this);
       Button btn_resta = (Button) findViewById(R.id.btn_resta);
       btn_resta.setOnClickListener(this);
       Button btn_suma = (Button) findViewById(R.id.btn_suma);
       btn_suma.setOnClickListener(this);
       Button btn_exponencial = (Button) findViewById(R.id.btn_exponencial);
       btn_exponencial.setOnClickListener(this);
       Button btn_seno = (Button) findViewById(R.id.btn_seno);
       btn_seno.setOnClickListener(this);
       Button btn_coseno = (Button) findViewById(R.id.btn_coseno);
       btn_coseno.setOnClickListener(this);
       Button btn_tangente = (Button) findViewById(R.id.btn_tangente);
       btn_tangente.setOnClickListener(this);
       Button btn_log = (Button) findViewById(R.id.btn_log);
       btn_log.setOnClickListener(this);
       //igual y punto
       Button btn_punto = (Button) findViewById(R.id.btn_punto);
       btn_punto.setOnClickListener(this);
       Button btn_igual = (Button) findViewById(R.id.btn_igual);
       btn_igual.setOnClickListener(this);
       
    }

	@Override
	public void onClick(View v) {
		EditText txt_resultado = (EditText) findViewById(R.id.txt_resultado);
		int presionado = v.getId();
		String numero = txt_resultado.getText().toString();
		
		try{
		switch (presionado){
		
		//numeros
		case R.id.btn_0:
			txt_resultado.setText(numero+"0");
			exponencial = true;
			seno = true;
			coseno = true;
			tangente = true;
			
			break;
		case R.id.btn_1:
			txt_resultado.setText(numero+"1");
			raiz = true;
			seno = true;
			coseno = true;
			tangente = true;
			log = true;
			exponencial = true;
			
			break;
		case R.id.btn_2:
			txt_resultado.setText(numero+"2");
			raiz = true;
			seno = true;
			coseno = true;
			tangente = true;
			log = true;
			exponencial = true;
			
			
			break;
		case R.id.btn_3:
			txt_resultado.setText(numero+"3");
			raiz = true;
			seno = true;
			coseno = true;
			tangente = true;
			log = true;
			exponencial = true;
			
			
			break;
		case R.id.btn_4:
			txt_resultado.setText(numero+"4");
			raiz = true;
			seno = true;
			coseno = true;
			tangente = true;
			log = true;
			exponencial = true;
			
			
			break;
		case R.id.btn_5:
			txt_resultado.setText(numero+"5");
			raiz = true;
			seno = true;
			coseno = true;
			tangente = true;
			log = true;
			exponencial = true;
		
			break;
		case R.id.btn_6:
			txt_resultado.setText(numero+"6");
			raiz = true;
			seno = true;
			coseno = true;
			tangente = true;
			log = true;
			exponencial = true;
			
			
			break;
		case R.id.btn_7:
			txt_resultado.setText(numero+"7");
			raiz = true;
			seno = true;
			coseno = true;
			tangente = true;
			log = true;
			exponencial = true;
			
			break;
		case R.id.btn_8:
			txt_resultado.setText(numero+"8");
			raiz = true;
			seno = true;
			coseno = true;
			tangente = true;
			log = true;
			exponencial = true;
			
		
			break;
		case R.id.btn_9:
			txt_resultado.setText(numero+"9");
		    raiz = true;
		    seno = true;
			coseno = true;
			tangente = true;
			log = true;
			exponencial = true;
			
//			suma = true;
//			resta = true;
//			multiplicacion = true;
//			division = true;
//			igual = true;
			break;
			
			//boton punto
		case R.id.btn_punto:
			if(decimal == false){
				txt_resultado.setText(numero+".");
			decimal = true;
			}else{
				return;
			}
			break;
			
			
			//operaciones aritmeticas			
		case R.id.btn_suma:
//			if(suma == false){
//		    	return;
//		    }else{
		    suma = true;
			numeroObtenido[0] = Double.parseDouble(numero);
			txt_resultado.setText("");
			decimal = false;
		
//		    }
			break;
		case R.id.btn_resta:
//			if(resta == false){
//		    	return;
//		    }else{
		    	resta = true;
			numeroObtenido[0] = Double.parseDouble(numero);
			txt_resultado.setText("");
			decimal = false;
			
//		   }
			break;
		case R.id.btn_multiplicacion:
//			if(multiplicacion == false){
//		    	return;
//		    }else{
			multiplicacion = true;
			numeroObtenido[0] = Double.parseDouble(numero);
			txt_resultado.setText("");
			decimal = false;
//		    }
			break;
		case R.id.btn_division:
//			if(division == false){
//		    	return;
//		    }else{
			division = true;
			numeroObtenido[0] = Double.parseDouble(numero);
			txt_resultado.setText("");
			decimal = false;
//		    }
			break;
		case R.id.btn_raiz:
		    if(raiz == false){
		    	return;
		    }else{
			numeroObtenido[0] = Double.parseDouble(numero);
			resultado = Math.sqrt(numeroObtenido[0]);
			txt_resultado.setText(String.valueOf(resultado));
			
		    }
			break;
		case R.id.btn_exponencial:
			if(exponencial == false){
		    	return;
		    }else{
			numeroObtenido[0] = Double.parseDouble(numero);
			resultado = Math.exp(numeroObtenido[0]);
			txt_resultado.setText(String.valueOf(resultado));
		    }
			break;
        case R.id.btn_seno:
        	if(seno == false){
		    	return;
		    }else{
			numeroObtenido[0] = Double.parseDouble(numero);
			resultado = Math.sin(numeroObtenido[0]);
			txt_resultado.setText(String.valueOf(resultado));
		    }
			break;
        case R.id.btn_coseno:
        	if(coseno == false){
		    	return;
		    }else{
			numeroObtenido[0] = Double.parseDouble(numero);
			resultado = Math.cos(numeroObtenido[0]);
			txt_resultado.setText(String.valueOf(resultado));
		    }
			break;
        case R.id.btn_tangente:
        	if(tangente == false){
		    	return;
		    }else{
        	numeroObtenido[0] = Double.parseDouble(numero);
        	resultado = Math.tan(numeroObtenido[0]);
        	txt_resultado.setText(String.valueOf(resultado));
		    }
        	break;
        case R.id.btn_log:
        	if(log == false){
		    	return;
		    }else{
        	numeroObtenido[0] = Double.parseDouble(numero);
        	resultado = Math.log(numeroObtenido[0]);
        	txt_resultado.setText(String.valueOf(resultado));
		    }
        	break;

			//boton igual
		case R.id.btn_igual:
//			if(igual == false){
//		    	return;
//		    }else{
			
			numeroObtenido[1] = Double.parseDouble(numero);
			
			if(suma == true){
				resultado = numeroObtenido[0] + numeroObtenido[1];
				txt_resultado.setText(String.valueOf(resultado));
				
				
			}else if(resta == true){
				resultado = numeroObtenido[0] - numeroObtenido[1];
				txt_resultado.setText(String.valueOf(resultado));
				
			}else if(multiplicacion == true){
				resultado = numeroObtenido[0] * numeroObtenido[1];
				txt_resultado.setText(String.valueOf(resultado));
				
			}else if(division == true){
				resultado = numeroObtenido[0] / numeroObtenido[1];
				txt_resultado.setText(String.valueOf(resultado));
				
			}
			suma = false;
            decimal = false;
			resta = false;
			multiplicacion = false;
			division = false;
			igual = false;
//		    }
			
			
			//igual=false;
			break;
			
			//limpiando pantalla			
		case R.id.btn_borrar:
			numero = numero.substring(0, numero.length() - 1);
			txt_resultado.setText(numero);
			break;
		case R.id.btn_limpiar:
			txt_resultado.setText("");
			decimal = false;
			raiz = false;
			seno = false;
			coseno = false;
			tangente = false;
			log = false;
			exponencial = false;
			suma = false;
			resta = false;
			multiplicacion = false;
			division = false;
			igual = false;
			break;
		
		}
		} catch (Exception e){
			txt_resultado.setText("");
		}
		
		
	}
}
