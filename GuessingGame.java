����   C J
      java/lang/Object <init> ()V  java/util/Random
    java/util/Scanner	      java/lang/System in Ljava/io/InputStream;
 
    (Ljava/io/InputStream;)V
     nextInt (I)I	     out Ljava/io/PrintStream;  $Bienvenue dans le jeu de devinette !
   ! " # $ java/io/PrintStream println (Ljava/lang/String;)V & ?J'ai choisi un nombre entre 1 et 100. À toi de deviner lequel. ( Entrez votre devinette : 
   * + $ print
 
 -  . ()I 0 1Félicitations ! Vous avez deviné le bon nombre.
 2 3 4 5  java/lang/Math abs 7 Chaud ! 9 Froid ! ; Essayez encore !
 
 = >  close @ GuessingGame Code LineNumberTable main ([Ljava/lang/String;)V StackMapTable G [Ljava/lang/String; 
SourceFile GuessingGame.java ! ?           A        *� �    B        	 C D  A  I     �� Y� 	L� 
Y� � M+d� `>66� � � %� � a� '� ),� ,6� � /� 6���� *d� 1d� 1� � 6� � � 8� � � :� 6���,� <�    B   V        	  
   "  *  2  7  ?  E  K  S  Y  _  p  {  �   � " � & � ' E   A � 2  F  
   � &  F  
  !
�   F  
     H    I