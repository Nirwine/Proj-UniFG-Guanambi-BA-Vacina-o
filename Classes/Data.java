package Thomas;

public Data(int dose, String imunobiologico, int aprazamento, int lote, int aplicaçao, int atraso,
String observação) {
super();
this.dose = dose;
this.imunobiologico = imunobiologico;
this.aprazamento = aprazamento;
this.lote = lote;
this.aplicaçao = aplicaçao;
this.atraso = atraso;
this.observação = observação;}

public int getDose() {
return dose;
}
public void setDose(int dose) {
this.dose = dose;
}
public int getAplicaçao() {
return aplicaçao;
}
public void setAplicaçao(int aplicaçao) {
this.aplicaçao = aplicaçao;
}
public int getAtraso() {
return atraso;
}
public void setAtraso(int atraso) {
this.atraso = atraso;
}
public String getObservação() {
return observação;
}
public void setObservação(String observação) {
this.observação = observação;
}
public String getImunobiologico() {
return imunobiologico;
}
public void setImunobiologico(String imunobiologico) {
this.imunobiologico = imunobiologico;
}
public int getAprazamento() {
return aprazamento;
}
public void setAprazamento(int aprazamento) {
this.aprazamento = aprazamento;
}
public int getLote() {
return lote;
}
public void setLote(int lote) {
this.lote = lote;
}


}