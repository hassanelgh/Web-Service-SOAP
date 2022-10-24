### Web Service SOAP :

1. initializer le projet :

   <img src="images/img.PNG" alt="">


2. ajouter dependance JAXWS:
   
   <img src="images/img1.png" alt="">


3. creation d'un class POJO BanqueService et Compte  dans un folder ws: 
   * class BanqueService :
      
      <img src="images/img_1.png" alt="">
   
   * class Compte :
      
      <img src="images/img_2.png" alt="">
      
   * folder : 
      
      <img src="images/img_3.png" alt="">

4. creation de webservices :
    
    * ajouter les annotations au BanqueService : 
        -  annotation WebService : concerne la classe (ajouter ServiceName pour specifier le nom de service)
        -  annotation WebMethod : concerne les méthodes (ajouter operationName pour specifier le nom de l'operation)

       <img src="images/img_4.png" alt="">
    

    
5. création de serveur JaxWS :

    <img src="images/img_5.png" alt="">
    
    * wsld :

        <img src="images/img_6.png" alt="">

    * xsd : 

        <img src="images/img_7.png" alt="">
    
    * tester par SoapUI :
      
       - creer project :

            <img src="images/img_8.png" alt="">

       - test Convert :

            <img src="images/img_9.png" alt="">

       - test getCompte :

            <img src="images/img_10.png" alt="">
      
       - test listComptes :

            <img src="images/img_11.png" alt="">

6. serialization de classe Compte :  (on utilise JaxB pour faire la convertion de Java à XML et l'inverse )

   <img src="images/img_12.png" alt="">




