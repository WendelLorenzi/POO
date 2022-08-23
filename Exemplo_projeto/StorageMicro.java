public class StorageMicro{

	Leitura l= new Leitura();

	Forno[] vetForno= new Forno[5];
	Telefone[] vetTel= new Telefone[5];

	void iniciaVet(int vet){
	for(int i= 0; i<5; i++){
		vetForno[i]= new Forno();
		vetTel[i]= new Telefone();
	}
}

	Forno insereMicro(Forno f){
		for(int i= 0; i<5; i++){
			vetForno[i].setGrauTemp(Integer.parseInt(l.entDados("\n Digite a temperatura: ")));
			vetForno[i].setPreco(Integer.parseInt(l.entDados("\n Digite o preco: ")));
			vetForno[i].setCor(l.entDados("\n Digite a cor: "));
			vetForno[i].getOrig().setPais(l.entDados("\n Digite o pais: "));
			vetForno[i].getOrig().setCod(Integer.parseInt(l.entDados("\n Digite o codigo do pais: ")));
		}
	}

	Telefone insereMicro(Telefone tel){
		for(int i= 0; i<5; i++){
			vetTel[i].setNumTel(Integer.parseInt(l.entDados("\n Digite o numero do tel: ")));
			vetTel[i].setPreco(Integer.parseInt(l.entDados("\n Digite o preco: ")));
			vetTel[i].setCor(l.entDados("\n Digite a cor: "));
			vetTel[i].getOrig().setPais(l.entDados("\n Digite o pais: "));
			vetTel[i].getOrig().setCod(Integer.parseInt(l.entDados("\n Digite o codigo do pais: ")));
		}
	}

}