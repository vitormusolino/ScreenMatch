public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.anoDeLancamento = 2000;
        meuFilme.nome = "Carros";

        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(8);
        meuFilme.avalia(7);
        meuFilme.avalia(10);
        
        System.out.println(meuFilme.pegaMedia());
    }
}
