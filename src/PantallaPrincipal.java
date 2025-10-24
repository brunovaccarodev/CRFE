import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class PantallaPrincipal extends JFrame {

    private UnidadesMedida unidadesMedida = new UnidadesMedida();
	private ConfigurarUnidadesMedida configurarUnidadesMedida = new ConfigurarUnidadesMedida();
	private DatoClimatico datoClimatico = new DatoClimatico();
	private EstacionMeteorologica estacionMeteorologica = new EstacionMeteorologica();
	private EstadisticasClimaticas estadisticasClimaticas = new EstadisticasClimaticas();
	private ExportarDatosClimaticos exportarDatosClimaticos = new ExportarDatosClimaticos();
	private GeneradorReportes generadorReportes = new GeneradorReportes();
	private Reporte reporte = new Reporte();

    public PantallaPrincipal() {
        setTitle("Climatic Registry for Enterprises");
        setSize(1000, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JMenuBar menuBar = new JMenuBar();
        
        JMenu menuMedidas = new JMenu("Configurar Unidades de Medida");
        JMenu datosClimatico = new JMenu ("Datos Climaticos");
        JMenu EstacionMeteorologica = new JMenu ("Estacion Meteorológica");
        JMenu EstadisticasClimaticas = new JMenu ("Estadísticas Climáticas");
        JMenu ExportarDatosClimaticos = new JMenu ("Exportar Datos Climáticos");
        JMenu menuReporte = new JMenu ("Reporte");
        

        JMenuItem CaF = new JMenuItem("Convertir Grados Celsius a Fahrenheit");
        JMenuItem FaC = new JMenuItem("Convertir Grados Fahrenheit a Celsius");
        JMenuItem Salir = new JMenuItem("Salir");
        
        JMenuItem temp = new JMenuItem("Registrar Temperatura");
        JMenuItem hume = new JMenuItem("Registrar Humedad");
        JMenuItem precipita = new JMenuItem ("Registrar Precipitacion");
        JMenuItem vien = new JMenuItem ("Registrar Viento");
        JMenuItem rad = new JMenuItem ("Registrar Radiacion");
        
        JMenuItem nom = new JMenuItem ("Nombre");
        JMenuItem ubi = new JMenuItem ("Ubicación");
        JMenuItem lat = new JMenuItem ("Latitud");
        JMenuItem lon = new JMenuItem ("Longitud");
        JMenuItem alt = new JMenuItem ("Altitud");
        JMenuItem tip = new JMenuItem ("Tipo");
        JMenuItem est = new JMenuItem ("Estado");
        JMenuItem fec = new JMenuItem ("Fecha de instalación");
        
        JMenuItem tempPromed = new JMenuItem ("Registrar Temperatura promedio");
        JMenuItem humPromed = new JMenuItem ("Registrar Humedad promedio");
        JMenuItem precipPromed = new JMenuItem ("Registrar Precipitación promedio");
        JMenuItem veloVienPromed = new JMenuItem ("Registrar Velocidad del viento promedio");
        JMenuItem radiacionPromed = new JMenuItem ("Registrar Radiación promedio");
        
        JMenuItem PDF = new JMenuItem ("Exportar a PDF");
        JMenuItem CSV = new JMenuItem ("Exportar a CSV");
        
        JMenuItem generarReporte = new JMenuItem ("Generar Reporte de datos climáticos");
        
        
        
        
        
        

        menuMedidas.add(CaF);
        menuMedidas.add(FaC);
        menuMedidas.addSeparator();
        menuMedidas.add(Salir);
        
        datosClimatico.add(temp);
        datosClimatico.add(hume);
        datosClimatico.add(precipita);
        datosClimatico.add(vien);
        datosClimatico.add(rad);
        
        EstacionMeteorologica.add(nom);
        EstacionMeteorologica.add(ubi);
        EstacionMeteorologica.add(lat);
        EstacionMeteorologica.add(lon);
        EstacionMeteorologica.add(alt);
        EstacionMeteorologica.add(tip);
        EstacionMeteorologica.add(est);
        EstacionMeteorologica.add(fec);
        
        EstadisticasClimaticas.add(tempPromed);
        EstadisticasClimaticas.add(humPromed);
        EstadisticasClimaticas.add(precipPromed);
        EstadisticasClimaticas.add(veloVienPromed);
        EstadisticasClimaticas.add(radiacionPromed);
        
        ExportarDatosClimaticos.add(PDF);
        ExportarDatosClimaticos.add(CSV);
        
        menuReporte.add(generarReporte);
        
        
        
        

        menuBar.add(menuMedidas);
        menuBar.add(datosClimatico);
        menuBar.add(EstacionMeteorologica);
        menuBar.add(EstadisticasClimaticas);
        menuBar.add(ExportarDatosClimaticos);
        menuBar.add(generarReporte);
        setJMenuBar(menuBar);
  

      

        CaF.addActionListener(e -> {
            String celsius = JOptionPane.showInputDialog(null, "Ingresar grados Celsius: ", "Entrada de datos", JOptionPane.QUESTION_MESSAGE);

            if (celsius == null) {
                JOptionPane.showMessageDialog(null, "Se ha cancelado la operación");
                return;
            }

            if (celsius.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor ingresa un valor");
                return;
            }

            try {
                double numeroDouble = Double.parseDouble(celsius.trim());
                double num = configurarUnidadesMedida.convertirUnidadTemperaturaCelsius(numeroDouble);
                JOptionPane.showMessageDialog(null, "El equivalente a los grados ingresados es: " + num + "°F", "Grados Celsius a Fahrenheit", JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Por favor ingresa un número válido", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        FaC.addActionListener(e -> {
            String fahrenheit = JOptionPane.showInputDialog(null, "Ingresar grados Fahrenheit: ", "Entrada de datos", JOptionPane.QUESTION_MESSAGE);

            if (fahrenheit == null) {
                JOptionPane.showMessageDialog(null, "Se ha cancelado la operación");
                return;
            }

            if (fahrenheit.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor ingresa un valor");
                return;
            }

            try {
                double numeroDouble = Double.parseDouble(fahrenheit.trim());
                double num = configurarUnidadesMedida.convertirUnidadTemperaturaFahrenheit(numeroDouble);
                JOptionPane.showMessageDialog(null, "El equivalente a los grados ingresados es: " + num + "°C", "Grados Fahrenheit a Celsius", JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Por favor ingresa un número válido", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
        Salir.addActionListener(e -> {
         	System.exit(0);
        });
        
        
        temp.addActionListener(e -> {
        	String tempe = JOptionPane.showInputDialog(null, "Ingresar temperatura:", "Registro de temperatura", JOptionPane.QUESTION_MESSAGE);
        	double doubletempe = Double.parseDouble(tempe);
        	datoClimatico.establecerTemperatura(doubletempe);
        	double temperaturaObtenida = datoClimatico.obtenerTemperatura();
        	JOptionPane.showMessageDialog(null, "Se ha registrado la temperatura: " + temperaturaObtenida + "°"+ " correctamente", "Registro de temperatura" , JOptionPane.INFORMATION_MESSAGE);
  
        });
        
        hume.addActionListener(e -> {
        	String humed = JOptionPane.showInputDialog(null, "Ingresar humedad:", "Registro de humedad", JOptionPane.QUESTION_MESSAGE);
        	double doublehume = Double.parseDouble(humed);
        	datoClimatico.establecerHumedad(doublehume);
        	double HumedadObtenida = datoClimatico.obtenerHumedad();
        	JOptionPane.showMessageDialog(null, "Se ha registrado la humedad: " + HumedadObtenida +  " % " + " correctamente", "Registro de temperatura" , JOptionPane.INFORMATION_MESSAGE);
  
        });
        
        precipita.addActionListener(e -> {
        	String precipitacio = JOptionPane.showInputDialog(null, "Ingresar precipitacion:", "Registro de precipitacion", JOptionPane.QUESTION_MESSAGE);
        	double doubleprecipita = Double.parseDouble(precipitacio);
        	datoClimatico.establecerPrecipitacion(doubleprecipita);
        	double PrecipitacionObtenida = datoClimatico.obtenerPrecipitacion();
        	JOptionPane.showMessageDialog(null, "Se ha registrado probabilidad de precipitacion: " + PrecipitacionObtenida +  " % " + " correctamente", "Registro de precipitacion" , JOptionPane.INFORMATION_MESSAGE);
  
        });
        
        vien.addActionListener(e -> {
        	String vient = JOptionPane.showInputDialog(null, "Ingresar velocidad de viento:", "Registro de viento", JOptionPane.QUESTION_MESSAGE);
        	double doublevient = Double.parseDouble(vient);
        	datoClimatico.establecerViento(doublevient);
        	double VientoObtenido = datoClimatico.obtenerViento();
        	JOptionPane.showMessageDialog(null, "Se ha registrado la velocidad del viento: " + VientoObtenido +  " km/h " + " correctamente", "Registro de viento" , JOptionPane.INFORMATION_MESSAGE);
  
        });
        
        rad.addActionListener(e -> {
        	String radia = JOptionPane.showInputDialog(null, "Ingresar radiacion solar:", "Registro de radiacion", JOptionPane.QUESTION_MESSAGE);
        	double doubleradiac = Double.parseDouble(radia);
        	datoClimatico.establecerRadiacion(doubleradiac);
        	double radiacionObtenida = datoClimatico.obtenerRadiacion();
        	JOptionPane.showMessageDialog(null, "Se ha registrado la radiacion " + radiacionObtenida +  " W/m² " + " correctamente", "Registro de radiacion" , JOptionPane.INFORMATION_MESSAGE);
  
        });
        
        nom.addActionListener(e -> {
            String nombre = JOptionPane.showInputDialog(null, "Ingresar Nombre de estación meteológica: ", "Entrada de datos", JOptionPane.QUESTION_MESSAGE);
            estacionMeteorologica.establecerNombre(nombre);
            JOptionPane.showMessageDialog(null, "Se ha registrado el nombre: " + nombre + " correctamente", "Ingresar nombre" , JOptionPane.INFORMATION_MESSAGE);
        });
        
        ubi.addActionListener(e -> {
            String ubicacion = JOptionPane.showInputDialog(null, "Ingresar ubicación de estación: ", "Entrada de datos", JOptionPane.QUESTION_MESSAGE);
            estacionMeteorologica.establecerUbicacion(ubicacion);
            JOptionPane.showMessageDialog(null, "Se ha registrado la ubicación: " + ubicacion + " correctamente", "Ingresar ubicación" , JOptionPane.INFORMATION_MESSAGE);
        });
        
        lat.addActionListener(e -> {
            String latitud = JOptionPane.showInputDialog(null, "Ingresar latitud de estación: ", "Entrada de datos", JOptionPane.QUESTION_MESSAGE);
            double doublelatitud = Double.parseDouble(latitud);
            estacionMeteorologica.establecerLatitud(doublelatitud);
            double latobtenida = estacionMeteorologica.obtenerLatitud();
            JOptionPane.showMessageDialog(null, "Se ha registrado la siguiente latitud de estación: " + latobtenida + " correctamente", "Ingresar latitud" , JOptionPane.INFORMATION_MESSAGE);
        });
        
        lon.addActionListener(e -> {
            String longitud = JOptionPane.showInputDialog(null, "Ingresar longitud de estación: ", "Entrada de datos", JOptionPane.QUESTION_MESSAGE);
            double doublelongitud = Double.parseDouble(longitud);
            estacionMeteorologica.establecerLogitud(doublelongitud);
            double longobtenida = estacionMeteorologica.obtenerLongitud();
            JOptionPane.showMessageDialog(null, "Se ha registrado la siguiente latitud de estación: " + longobtenida + " correctamente", "Ingresar longitud" , JOptionPane.INFORMATION_MESSAGE);
        });
        
        alt.addActionListener(e -> {
            String altitud = JOptionPane.showInputDialog(null, "Ingresar altitud de estación: ", "Entrada de datos", JOptionPane.QUESTION_MESSAGE);
            double doublealtitud= Double.parseDouble(altitud);
            estacionMeteorologica.establecerAltitud(doublealtitud);
            double altobtenida = estacionMeteorologica.obtenerAltitud();
            JOptionPane.showMessageDialog(null, "Se ha registrado la siguiente altitud de estación: " + altobtenida + " correctamente", "Ingresar altitud" , JOptionPane.INFORMATION_MESSAGE);
        });
        
        tip.addActionListener(e -> {
            String tipo = JOptionPane.showInputDialog(null, "Ingresar tipo de estación: ", "Entrada de datos", JOptionPane.QUESTION_MESSAGE);
            estacionMeteorologica.establecerTipo(tipo);
            String tipoobtenido = estacionMeteorologica.obtenerTipo();
            JOptionPane.showMessageDialog(null, "Se ha registrado el siguiente tipo de estación: " + tipoobtenido , "Ingresar tipo" , JOptionPane.INFORMATION_MESSAGE);
        });
        
        est.addActionListener(e -> {
            String estado = JOptionPane.showInputDialog(null, "Ingresar estado de estación: ", "Entrada de datos", JOptionPane.QUESTION_MESSAGE);
            estacionMeteorologica.establecerEstado(estado);
            String estadoObtenido = estacionMeteorologica.obtenerEstado();
            boolean activa = estacionMeteorologica.esActiva();
            JOptionPane.showMessageDialog(null, "Se ha registrado el siguiente estado de estación: " + estadoObtenido + " y se encuentra en valor: " + activa, "Ingresar estado" , JOptionPane.INFORMATION_MESSAGE);
        });
        
        fec.addActionListener(e -> {
            String fecha = JOptionPane.showInputDialog(null, "Ingresar Fecha de instalación : ", "Entrada de datos", JOptionPane.QUESTION_MESSAGE);
            estacionMeteorologica.establecerFechaDeInstalacion(fecha);
            String fechaObtenida = estacionMeteorologica.obtenerFechaDeInstalacion();
            JOptionPane.showMessageDialog(null, "Se ha registrado la siguiente fecha de instalación: " + fechaObtenida + " correctamente" , "Ingresar Fecha de instalación" , JOptionPane.INFORMATION_MESSAGE);
        });
        
        tempPromed.addActionListener(e -> {
            String temperaturaP = JOptionPane.showInputDialog(null, "Ingresar Temperatura promedio : ", "Entrada de datos", JOptionPane.QUESTION_MESSAGE);
            double doubletemperaturaP= Double.parseDouble(temperaturaP);
            estadisticasClimaticas.establecerTemperaturaPromedio(doubletemperaturaP);
            double temperaturaPObtenida = estadisticasClimaticas.obtenerTemperaturaPromedio();
            JOptionPane.showMessageDialog(null, "Se ha registrado la siguiente temperatura promedio " + temperaturaPObtenida + "° correctamente" , "Ingresar Temperatura Promedio" , JOptionPane.INFORMATION_MESSAGE);
        });
        
        humPromed.addActionListener(e -> {
            String humedadP = JOptionPane.showInputDialog(null, "Ingresar Humedad promedio : ", "Entrada de datos", JOptionPane.QUESTION_MESSAGE);
            double doublehumedadP= Double.parseDouble(humedadP);
            estadisticasClimaticas.establecerHumedadPromedio(doublehumedadP);
            double humedadPObtenida = estadisticasClimaticas.obtenerHumedadPromedio();
            JOptionPane.showMessageDialog(null, "Se ha registrado la siguiente humedad promedio " + humedadPObtenida + "% correctamente" , "Ingresar Humedad Promedio" , JOptionPane.INFORMATION_MESSAGE);
        });
        
        precipPromed.addActionListener(e -> {
            String precipitacionP = JOptionPane.showInputDialog(null, "Ingresar Precipitación promedio : ", "Entrada de datos", JOptionPane.QUESTION_MESSAGE);
            double doublepreciptacionP= Double.parseDouble(precipitacionP);
            estadisticasClimaticas.establecerPrecipitacionPromedio(doublepreciptacionP);
            double precipitacionPObtenida = estadisticasClimaticas.obtenerPrecipitacionPromedio();
            JOptionPane.showMessageDialog(null, "Se ha registrado la siguiente precipitación promedio " + precipitacionPObtenida + "% correctamente" , "Ingresar Precipitación Promedio" , JOptionPane.INFORMATION_MESSAGE);
        });
        
        veloVienPromed.addActionListener(e -> {
            String VelovientP = JOptionPane.showInputDialog(null, "Ingresar Velocidad del viento promedio : ", "Entrada de datos", JOptionPane.QUESTION_MESSAGE);
            double VelovientPromedio= Double.parseDouble(VelovientP);
            estadisticasClimaticas.establecerVelocidadVientoPromedio(VelovientPromedio);
            double velocidadVientPromeObtenida = estadisticasClimaticas.obtenerVelocidadVientoPromedio();
            JOptionPane.showMessageDialog(null, "Se ha registrado la siguiente velocidad del viento promedio " + velocidadVientPromeObtenida + " km/h correctamente" , "Ingresar Velocidad del viento Promedio" , JOptionPane.INFORMATION_MESSAGE);
        });
        
        radiacionPromed.addActionListener(e -> {
            String radiacionP = JOptionPane.showInputDialog(null, "Ingresar radiación promedio : ", "Entrada de datos", JOptionPane.QUESTION_MESSAGE);
            double RadiacionPromedio= Double.parseDouble(radiacionP);
            estadisticasClimaticas.establecerRadiacionPromedio(RadiacionPromedio);
            double RadiacionPromedioObtenida = estadisticasClimaticas.obtenerRadiacionPromedio();
            JOptionPane.showMessageDialog(null, "Se ha registrado la siguiente radiación promedio " + RadiacionPromedioObtenida + " W/m² correctamente" , "Ingresar Radiación Promedio" , JOptionPane.INFORMATION_MESSAGE);
        });
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new PantallaPrincipal().setVisible(true));
      
    }
}
