export class persona{
    id?: number;
    nombre: String;
    apellido: String;
    acerca: String;
    img: String;

    constructor(nombre: String,apellido: String, acerca: String, img: String){
        this.nombre = nombre;
        this.apellido = apellido;
        this.acerca = acerca;
        this.img = img;
    }
}