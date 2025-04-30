import java.io.*;
import java.util.*;
import java.lang.*;

public class Hash {
	// Atributos
    public double item; // valor do item armazenado
    public int estado; // 0 = LIVRE, 1 = OCUPADO, 2 = REMOVIDO

	// Construtor
    public Hash() { 
        estado = 0; // começa como LIVRE
    }
}
