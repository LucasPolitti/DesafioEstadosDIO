public class Estados {

   public String nome;
   public Integer populacao;


   public Estados(String nome, Integer populacao) {
    this.nome = nome;
    this.populacao = populacao;
}


public String getNome() {
    return nome;
}


public void setNome(String nome) {
    this.nome = nome;
}


public Integer getPopulacao() {
    return populacao;
}


public void setPopulacao(Integer populacao) {
    this.populacao = populacao;
}


@Override
public String toString() {
    return "Estados [nome=" + nome + ", populacao=" + populacao + "]";
}


@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((nome == null) ? 0 : nome.hashCode());
    result = prime * result + ((populacao == null) ? 0 : populacao.hashCode());
    return result;
}


@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    Estados other = (Estados) obj;
    if (nome == null) {
        if (other.nome != null)
            return false;
    } else if (!nome.equals(other.nome))
        return false;
    if (populacao == null) {
        if (other.populacao != null)
            return false;
    } else if (!populacao.equals(other.populacao))
        return false;
    return true;
}




   



    
}
