Reciclando o código da parte1 nunha nova clase, usa como ficheiro orixe a imaxe foto.jpg e
copiaa como foto2.jpg.

    1- Ocupan o mesmo?

    SI  

---------------------------

    2- Se executo o método con append sobre foto2.jpg, qué ocorre se abrimos a imaxe? vese
    repetida? canto ocupa agora foto2.jpg?

    Se ve igual, pero ocupa el doble

--------------------------
    
    4-  Notas diferencia na velocidade copiando imaxes con BufferedStream fronte a non usalo?

    Al ser un archivo pequeño, no se aprecia la diferencia de velocidad
    Si fuesen archivos mas grandes se notaria la diferencia de velodidad


Parte 3
Seguindo coos fluxos binarios de datos, agora tratarémolos como datos primitivos usando
DataInputStream e DataOutputStream. Vendo a documentación fixaraste en que
dispoñemos de métodos para diferentes tipos de datos. Usando estes métodos:
1- Escribe os métodos que precises para:
Grabar unha mesma cadea de texto tres veces consecutivas nun ficheiro denominado
texto3.txt usando o metodo writeUTF e amosar o tamaño do ficheiro cada vez que grabes a
cadea
Ler do ficheiro as cadeas dicindo canto queda por ler.
Cadea: "o tempo está xélido".
O resultado da execucion será algo como:
escribindo a cadea: o tempo está xélido
tamano do ficheiro: 23 bytes
[...]
escribindo a cadea: o tempo está xélido
tamano do ficheiro: 69 bytes
tamano final do ficheiro: 69 bytes
quedan: 69 bytes por ler
cadea: o tempo está xélido
[...]
quedan: 23 bytes por ler
cadea: o tempo está xélido
Xa non queda nada por ler
Para saber se cando estamos lendo xa acadamos a fin do ficheiro, podemos usar o metodo
.available() da clase DataInputStream que devolvera o valor 0 cando xa non quede nada por
ler.
Metodos a usar :
DataOutputStream : size(), writeUTF(String)
-o metodo size() devolve o tamaño en bytes do ficheiro no que estamos a escribir
-o metodo writeUTF(String) escribe a cadea que se pasa como parametro
DataInputStream : available(), readUTF()
-o metodo available() devolta o valor 0 se xa se leron todos os bytes do ficheiro
-o metodo readUTF() lee calquera String que fose grabado previamente nun ficheiro có
metodo writeUTF(String).
WriteUTF(String) escribe 2 bytes indicando a lonxitude de String + 1 byte por cada caracter
do String que lle pasamos como parámetro,(xeralmente 1 byte, pero pode precisar ata 3
bytes dependendo do caracter).