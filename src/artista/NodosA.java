package artista;
//PRUEBAS PARA ARTISTA
//
public class NodosA {
      public static  Form Principal = new Form();
      public static  ShowAlbumes Secundario= new ShowAlbumes();
        
       static class Artistas {//inner class
        String info;
        Artistas SiguienteA;//LlILNK
        Albums Album = null;     //RLINK

        public Artistas(String info) {
            this.info = info;
        }

        public Artistas() {
        }

        public String getInfo() {
            return info;
        }

        public void setInfo(String info) {
            this.info = info;
        }

        public Artistas getSiguienteA() {
            return SiguienteA;
        }

        public void setSiguienteA(Artistas SiguienteA) {
            this.SiguienteA = SiguienteA;
        }

        public Albums getAlbum() {
            return Album;
        }

        public void setAlbum(Albums Album) {
            this.Album = Album;
        }
        
        
    static Artistas Create(Artistas Ptr,String Nombre){
        if (Ptr == null) {
            Ptr = new Artistas(Nombre);
            Ptr.setSiguienteA(null);
        }else{
            Artistas q = new Artistas(Nombre);
            q.setSiguienteA(Ptr);
            Ptr =q;
        }
        
        return Ptr; 
    }
    
    public static Artistas AñadirAlbum(Artistas Ptr,String Esc, Albums A ){
        Artistas Copy = Ptr; 
            while(Copy!= null)
            {
                if (Copy.getInfo().equals(Esc)) 
                {
                    if(Copy.getAlbum()!=null){
                    A.setSiguienteAl(Copy.getAlbum());
                    Copy.setAlbum(A);
                    }else{
                    A.setSiguienteAl(null);
                    Copy.setAlbum(A);
                    }
                }
                Copy = Copy.getSiguienteA();
            }
        
        
        //
        return Ptr; 
    }
  
    }
       static class Albums {//inner class
        String info;
        Albums SiguienteAl = null;//LlILNK
        Canciones Cancion = null;     //RLINK
        String Nombre;

        public Albums(String a) {
            this.Nombre = a; 
        }
            
        public String getInfo() {
            return info;
        }

        public void setInfo(String info) {
            this.info = info;
        }

        public Albums getSiguienteAl() {
            return SiguienteAl;
        }

        public void setSiguienteAl(Albums SiguienteAl) {
            this.SiguienteAl = SiguienteAl;
        }

        public Canciones getCancion() {
            return Cancion;
        }

        public void setCancion(Canciones Cancion) {
            this.Cancion = Cancion;
        }

        public String getNombre() {
            return Nombre;
        }

        public void setNombre(String Nombre) {
            this.Nombre = Nombre;
        }
        
        public static Artistas AgregarCancion(Artistas ptr, String art, String alb, Canciones c){
            ///////////////
            ///////
            NodosA.Albums al;
            NodosA.Artistas copy = NodosA.Principal.ptrArtistas;
             while(copy !=null){
                if (copy.getInfo().equals(art)) {
                    al = copy.getAlbum();
                    while(al!=null){
                        if (al.getNombre().equals(alb)) {
                            if (al.getCancion()==null) {
                                c.setSiguienteC(null);
                                al.setCancion(c);
                            }else{
                            c.setSiguienteC(al.getCancion());
                            al.setCancion(c);
                            }
                        }
                    al = al.getSiguienteAl(); 
                    }
                }
                copy = copy.getSiguienteA();
            }
            return ptr; 
        }
        
        
    
     }
       static class Canciones {//inner class
        String nombre;
        String tamaño; 
        String Descripcion; 
        String Caratula;
        Canciones SiguienteC;//LlILNK

        public Canciones(String nombre) {
            this.nombre = nombre;
        }

        public Canciones(String nombre, String tamaño, String Descripcion, String Caratula, Canciones SiguienteC) {
            this.nombre = nombre;
            this.tamaño = tamaño;
            this.Descripcion = Descripcion;
            this.Caratula = Caratula;
            this.SiguienteC = SiguienteC;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getTamaño() {
            return tamaño;
        }

        public void setTamaño(String tamaño) {
            this.tamaño = tamaño;
        }

        public String getDescripcion() {
            return Descripcion;
        }

        public void setDescripcion(String Descripcion) {
            this.Descripcion = Descripcion;
        }

        public String getCaratula() {
            return Caratula;
        }

        public void setCaratula(String Caratula) {
            this.Caratula = Caratula;
        }

        public Canciones getSiguienteC() {
            return SiguienteC;
        }

        public void setSiguienteC(Canciones SiguienteC) {
            this.SiguienteC = SiguienteC;
        }
        
     }
       
     
    public static void main(String[] args) {
        // TODO code application logic here
        new Login().setVisible(true);
        
    }
    
}
