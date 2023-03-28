import java.util.ArrayList;     
public class Playlist{
    public static void main(String[] args){
        ArrayList<String> listaParaIlhaDeserta = new ArrayList<String>();
        listaParaIlhaDeserta.add("X6");
        listaParaIlhaDeserta.add("Maca Verde");
        listaParaIlhaDeserta.add("Vida loka part1");
        listaParaIlhaDeserta.add("Jesus chorou");
        listaParaIlhaDeserta.add("Sportlife");
        listaParaIlhaDeserta.add("Da Ponte pra ca");
        listaParaIlhaDeserta.add("Vida Loka part2");
        System.out.println(listaParaIlhaDeserta);
        
            listaParaIlhaDeserta.size();
            System.out.println(listaParaIlhaDeserta.size());

            while(listaParaIlhaDeserta.size() > 5){
                listaParaIlhaDeserta.remove(0);
                listaParaIlhaDeserta.remove(0);}
        System.out.println(listaParaIlhaDeserta);
        listaParaIlhaDeserta.size();
        System.out.println(listaParaIlhaDeserta.size());

        String musicaA ="Vida loka part1";
        String musicaB ="Vida Loka part2";
        int indexA = listaParaIlhaDeserta.indexOf(musicaA);
        int indexB = listaParaIlhaDeserta.indexOf(musicaB);
        System.out.println(indexA);
        System.out.println(indexB);
        String tempA = listaParaIlhaDeserta.get(indexA);
        listaParaIlhaDeserta.set(indexA, listaParaIlhaDeserta.get(indexB));
        listaParaIlhaDeserta.set(indexB, tempA);
        System.out.println("Minha lista de músicas (após trocar " + musicaA + " com " + musicaB + "): " + listaParaIlhaDeserta);
        listaParaIlhaDeserta.set(indexB, listaParaIlhaDeserta.get(indexA));
        listaParaIlhaDeserta.set(indexA, tempA);
        System.out.println("Minha lista após voltar as músicas as suas posições" + listaParaIlhaDeserta);
    }
}   