package fr.sogilis.blog.article.srp;

public interface Modem {

    public void Dial(String pno);

    public void Hangup();

    public void Send(char c);

    public char Recv();
}
