public class CountString {

    char [] vocali = {'a','e','i','o','u'};
    private final String nome;

    public CountString(String  nome){
        this.nome = nome;
    }

    //Get name:
    public String getNome(){
        return this.nome;
    }

    //Count the name lenght:
    public int getNameLenght(){
        return nome.length();
    }

    //Count the consonanti:
    public int getVocali(){
        int count = 0;
        for(int i = 0; i < getNameLenght(); i++) {
            if(nome.charAt(i) == 'a' || nome.charAt(i) == 'e' || nome.charAt(i) == 'i' || nome.charAt(i) == 'o'
            || nome.charAt(i) == 'u')
                count++;
        }
        return count;
    }

    public int getSpace(){
        int count = 0;
        for(int i = 0; i < getNameLenght(); i++) {
            if(nome.charAt(i) == ' '){
                count++;
            }
        }
        return count;
    }
}
