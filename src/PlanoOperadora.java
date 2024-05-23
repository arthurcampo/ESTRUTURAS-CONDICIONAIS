public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "M"; //Basico/ Midia / Turbo

        if(plano=="B"){
            System.out.println("100 min de ligaçao");
        }
        else if(plano=="M"){
            System.out.println("100 min de ligaçao");
            System.out.println("whats e Instagram grátis");
        }
            else if (plano=="M"){
        System.out.println("100 min de ligaçao");
        System.out.println("whats e Instagram grátis");
        System.out.println("5Gb de YouTube");
    }
        // refazendo utilizando o switch

        switch (plano){
            case "T":{
                System.out.println("5Gb de YouTube");
                //nao é utilizado o break, logo é impresso todos 
            }
            case "M":{
                System.out.println("whats e Instagram grátis");
            }
            case "B":{
                System.out.println("100 min de ligaçao");
            }
        }




}}
