public class Main {
    
    public static void main(String[] args) {
        Singleton escola = Singleton.getInstance("Sabha");
		Singleton escola2 = Singleton.getInstance("Bertoti");
		
		System.out.println(escola.Professores);
		System.out.println(escola2.Professores);
		
		escola.addProfessor("Marcelo");
		escola2.addProfessor("Jorge");
		
		System.out.println(escola.Professores);
        System.out.println(escola2.Professores);
    }


}
