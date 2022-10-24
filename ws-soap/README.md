### Web Service SOAP :

1. initializer le projet :

   <img src="images/img.PNG">


2. ajouter dependance JAXWS:
   
   <img src="images/img1.png">


3. creation d'un class POJO BanqueService et Compte  dans un folder ws: 
   * class BanqueService :
      
      <img src="images/img_1.png">
   
   * class Compte :
      
      <img src="images/img_2.png">
      
   * folder : 
      
      <img src="images/img_3.png">

4. creation de webservices :
    
    * ajouter les annotations au BanqueService : 
        -  annotation WebService : concerne la classe (ajouter ServiceName pour specifier le nom de service)
        -  annotation WebMethod : concerne les méthodes (ajouter operationName pour specifier le nom de l'operation)

       <img src="images/img_4.png">

    
    








