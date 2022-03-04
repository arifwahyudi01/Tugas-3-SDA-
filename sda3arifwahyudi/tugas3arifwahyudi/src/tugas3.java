import java.util.LinkedList;

public class tugas3 {
    public static void main(String[] args) {
        LinkedList <String> nama_mahasiswa = new LinkedList<>();
        LinkedList <Integer> no_bp = new LinkedList<>();
        LinkedList <String> alamat = new LinkedList<>();

        nama_mahasiswa.add("arif wahyudi");
        no_bp.add(2111523018);
        alamat.add("limau manih");

        System.out.println("nama mahasiswa : "+nama_mahasiswa);
        System.out.println("no bp : "+no_bp);
        System.out.println("alamat : "+alamat);
        
        //menambahkan element
        //nama mahasiswa
        nama_mahasiswa.addFirst("alvino albas");
        nama_mahasiswa.add("dio apriadandi");
        nama_mahasiswa.add("revi putra hernel");
        nama_mahasiswa.addLast("lutfi maulana");
        System.out.println("output tambah nama mahasisswa : "+nama_mahasiswa+", Ukuran :" +nama_mahasiswa.size());

        //no bp
        no_bp.addFirst(211152016);
        no_bp.addLast(2111523020);
        no_bp.add(211153022);
        no_bp.add(2111523001);
        System.out.println("output tambah no bp : "+no_bp+", Ukuran :" +no_bp.size());

        //alamat
        alamat.addFirst("talawi");
        alamat.addLast("pariaman");
        alamat.add("pekanbaru");
        alamat.add("limau manih");
        System.out.println("output tambah alamat : "+alamat+", Ukuran :" +alamat.size());

        //sisipkan element
         //nama mahasiswa
         nama_mahasiswa.set(3,"satria gemilang");
         nama_mahasiswa.set(1,"al amin");
         nama_mahasiswa.set(2,"faiz yunuz");
         nama_mahasiswa.set(4,"ikhlas");
         System.out.println("output sisip nama mahasiswa : "+nama_mahasiswa+", Ukuran :" +nama_mahasiswa.size());
 
         //no bp
         no_bp.set(2,2111152008);
         no_bp.set(1,2111521017);
         no_bp.set(3,2111523010);
         no_bp.set(4,2111523007);
         System.out.println("output sisip no bp : "+no_bp+", Ukuran :" +no_bp.size());
 
         //alamat
         alamat.set(1,"jl.pahlawan");
         alamat.set(4,"jl.mawar");
         alamat.set(3,"jl.setanggi");
         alamat.set(2,"jl.merdeka");
         System.out.println("output sisip alamat : "+alamat+", Ukuran :" +alamat.size());

         //remove element
         //nama mahasiswa
         nama_mahasiswa.removeFirst();
         nama_mahasiswa.remove("Wahyu");
         nama_mahasiswa.removeLast();
         System.out.println("output hapus nama mahasiswa : "+nama_mahasiswa+", Ukuran :" +nama_mahasiswa.size());
 
         //no bp
         no_bp.removeFirst();
         no_bp.remove(1);
         no_bp.removeLast();
         System.out.println("output hapus no bp : "+no_bp+", Ukuran :" +no_bp.size());
 
         //alamat
         alamat.removeFirst();
         alamat.remove("jl.merdeka");
         alamat.removeLast();
         System.out.println("output hapus alamat : "+alamat+", Ukuran :" +alamat.size());

         //push dan pop
         //pop
         nama_mahasiswa.pop();
         System.out.println("output hapus alamat : "+nama_mahasiswa+", Ukuran :" +alamat.size());
         no_bp.pop();
         System.out.println("output hapus alamat : "+no_bp+", Ukuran :" +alamat.size());
         alamat.pop();
         System.out.println("output pop alamat : "+alamat+", Ukuran :" +alamat.size());

         //push
         nama_mahasiswa.push("jelita");
         System.out.println("output hapus alamat : "+nama_mahasiswa+", Ukuran :" +alamat.size());
         no_bp.push(2011521001);
         System.out.println("output hapus alamat : "+no_bp+", Ukuran :" +alamat.size());
         alamat.push("jl.sumpah pemuda");
         System.out.println("output push alamat : "+alamat+", Ukuran :" +alamat.size());


         
 





 






    }
}