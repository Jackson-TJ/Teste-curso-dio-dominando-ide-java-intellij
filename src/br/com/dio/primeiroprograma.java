package br.com.dio;

import br.com.dio.model.Gato;

public class primeiroprograma {
    public static void main(String[] args) {
        Gato gato = new Gato()
        System.out.println(gato);
Livro = new Livro( nome: "O PROBLEMA DOS 3 CORPOS", numPaginas: 300);
        System.out.println(livros);
        /*  int a = 3;
        int b = 2;
        System.out.println("Hello World "+ (a+b));*/
    }
   class Livro{
         private String nome;
         private Integer numpPaginas;

       @Override
       public String toString() {
           return "Livro{" +
                   "nome='" + nome + '\'' +
                   ", numpPaginas=" + numpPaginas +
                   '}';
       }

       public String getNome() {
           return nome;

       }

       public void setNome(String nome) {
           this.nome = nome;
       }

       public Integer getNumpPaginas() {
           return numpPaginas;
       }

       public void setNumpPaginas(Integer numpPaginas) {
           this.numpPaginas = numpPaginas;
       }

       public Livro(String nome, Integer numpPaginas) {
           this.nome = nome;
           this.numpPaginas = numpPaginas;
       }
   }
}
