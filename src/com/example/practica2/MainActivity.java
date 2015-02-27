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
	//boolean raiz = false;
	
	
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
			break;
		case R.id.btn_1:
			txt_resultado.setText(numero+"1");
			break;
		case R.id.btn_2:
			txt_resultado.setText(numero+"2");
			break;
		case R.id.btn_3:
			txt_resultado.setText(numero+"3");
			break;
		case R.id.btn_4:
			txt_resultado.setText(numero+"4");
			break;
		case R.id.btn_5:
			txt_resultado.setText(numero+"5");
			break;
		case R.id.btn_6:
			txt_resultado.setText(numero+"6");
			break;
		case R.id.btn_7:
			txt_resultado.setText(numero+"7");
			break;
		case R.id.btn_8:
			txt_resultado.setText(numero+"8");
			break;
		case R.id.btn_9:
			txt_resultado.setText(numero+"9");
			break;
			
			//boton punto
		case R.id.btn_punto:
			if(decimal = false){
				txt_resultado.setText(numero+".");
			decimal = true;
			}else{
				return;
			}
			break;
			
			
			//operaciones aritmeticas			
		case R.id.btn_suma:
			suma = true;
			numeroObtenido[0] = Double.parseDouble(numero);
			txt_resultado.setText("");
			decimal = false;
			break;
		case R.id.btn_resta:
			resta = true;
			numeroObtenido[0] = Double.parseDouble(numero);
			txt_resultado.setText("");
			decimal = false;
			break;
		case R.id.btn_multiplicacion:
			multiplicacion = true;
			numeroObtenido[0] = Double.parseDouble(numero);
			txt_resultado.setText("");
			decimal = false;
			break;
		case R.id.btn_division:
			division = true;
			numeroObtenido[0] = Double.parseDouble(numero);
			txt_resultado.setText("");
			decimal = false;
			break;
		case R.id.btn_raiz:
			//raiz = true;
			numeroObtenido[0] = Double.parseDouble(numero);
			resultado = Math.sqrt(numeroObtenido[0]);
			txt_resultado.setText(String.valueOf(resultado));
			break;
		case R.id.btn_exponencial:
			
			numeroObtenido[0] = Double.parseDouble(numero);
			resultado = Math.exp(numeroObtenido[0]);
			txt_resultado.setText(String.valueOf(resultado));
			break;
        case R.id.btn_seno:
			
			numeroObtenido[0] = Double.parseDouble(numero);
			resultado = Math.sin(numeroObtenido[0]);
			txt_resultado.setText(String.valueOf(resultado));
			break;
        case R.id.btn_coseno:
			
			numeroObtenido[0] = Double.parseDouble(numero);
			resultado = Math.cos(numeroObtenido[0]);
			txt_resultado.setText(String.valueOf(resultado));
			break;
        case R.id.btn_tangente:
	
        	numeroObtenido[0] = Double.parseDouble(numero);
        	resultado = Math.tan(numeroObtenido[0]);
        	txt_resultado.setText(String.valueOf(resultado));
        	break;
        case R.id.btn_log:
	
        	numeroObtenido[0] = Double.parseDouble(numero);
        	resultado = Math.log(numeroObtenido[0]);
        	txt_resultado.setText(String.valueOf(resultado));
        	break;

			//boton igual
		case R.id.btn_igual:
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
			decimal = false;
			suma = false;
			resta = false;
			multiplicacion = false;
			division = false;
			break;
			
			//limpiando pantalla			
		case R.id.btn_borrar:
			txt_resultado.setText(txt_resultado.getText().length()-1);
			break;
		case R.id.btn_limpiar:
			txt_resultado.setText("");
			decimal = false;
			break;
		
		}
		} catch (Exception e){
			txt_resultado.setText("Error");
		}
		
		
	}
}
