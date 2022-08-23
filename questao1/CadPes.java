public class CadPes extends Pessoa{
    Pessoa vetPes[] = new Pessoa[10];

    public Pessoa consPesRg(Pessoa p) {
        for(int i = 0; i < vetPes.size(); i++) {
            if(vetPes[i].getRg() == p.getRg()) {
                return vetPes[i];
            }
        }

        return null;
    }
}
