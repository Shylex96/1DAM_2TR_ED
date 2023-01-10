package es.studium.EjercicioPOO2;

public class Pelicula {
	// Atributos privados
    private String titulo;
    private int ano;
    private float duracion;
    private Director director;

    public Pelicula() {
        // Constructor vacío
    	titulo = "";
    	ano = 0;
    	duracion = 0;
    	director = new Director();
    }

    public Pelicula(String titulo, int ano, float duracion, Director director) {
        // Constructor por parámetros
        this.titulo = titulo;
        this.ano = ano;
        this.duracion = duracion;
        this.director = director;
    }

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public float getDuracion() {
		return duracion;
	}

	public void setDuracion(float duracion) {
		this.duracion = duracion;
	}

	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}
    
}
