public class mainGetSet {
    public static void main(String[] args) {
        GetSet GetSet = new GetSet();
        
        GetSet.setNidn("00012654");
        GetSet.setNamaDosen("Suparman");
        GetSet.setJurusan("Teknik Informatika");
        GetSet.setFakultas("Ilmu Komputer");
        GetSet.setEmail("suparman@gmail.com");
        
        System.out.println("Data Dosen");
        System.out.println("NIDN        : "+GetSet.getNidn());
        System.out.println("Nama Dosen  : "+GetSet.getNamaDosen());
        System.out.println("Jurusan     : "+GetSet.getJurusan());
        System.out.println("Fakultas    : "+GetSet.getFakultas());
        System.out.println("Email       : "+GetSet.getEmail());
   
    }
    
}
