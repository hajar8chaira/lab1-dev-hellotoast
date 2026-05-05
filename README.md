# LAB 1 - HelloToast : Composants et Evenements Android
**Cours :** Programmation Mobile : Android avec Java  
**Objectif :** Creer une application interactive simple utilisant des boutons, des messages Toast et la mise a jour dynamique d'un TextView.

---

## Demonstration Video
Voici le fonctionnement de l'application (Toast et Incrementaison) :

![Demonstration HelloToast](./img-lab1-dev/video/demo.mp4)

---

## Etape 1 : Creation du projet
Le projet a ete initialise sous Android Studio avec les parametres suivants :
- **Template :** Empty Activity
- **Nom du projet :** HelloToast
- **Langage :** Java
- **API Minimum :** 24 (Android 7.0)

---

## Etape 2 : Conception de l'interface (XML)
L'interface utilisateur est definie dans `activity_main.xml`. Nous utilisons un `LinearLayout` vertical pour organiser les elements.

```xml
<LinearLayout 
    android:orientation="vertical"
    android:gravity="center">

    <!-- Affiche le chiffre du compteur -->
    <TextView
        android:id="@+id/text_count"
        android:text="0"
        android:textSize="120sp" />

    <!-- Bouton pour le message -->
    <Button
        android:id="@+id/button_toast"
        android:text="Afficher un message" />

    <!-- Bouton pour compter -->
    <Button
        android:id="@+id/button_count"
        android:text="Incrementer le compteur" />
</LinearLayout>
```

### Concepts cles :
*   **android:id** : Identifiant unique permettant au code Java de manipuler l'element.
*   **sp (Scale-independent Pixels)** : Unite de mesure recommandee pour les polices de caracteres.

---

## Etape 3 : Logique Java (MainActivity.java)
Le fichier Java contient la logique de l'application.

```java
public class MainActivity extends AppCompatActivity {
    private int count = 0; // Variable d'etat
    private TextView textCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textCount = findViewById(R.id.text_count);
        
        // Listener pour le Toast
        findViewById(R.id.button_toast).setOnClickListener(v -> {
            Toast.makeText(this, "Bonjour !", Toast.LENGTH_SHORT).show();
        });

        // Listener pour l'incrementation
        findViewById(R.id.button_count).setOnClickListener(v -> {
            count++;
            textCount.setText(String.valueOf(count));
        });
    }
}
```

### Analyse du code :
1.  **findViewById()** : Cree un pont entre l'element graphique du XML et l'objet Java.
2.  **setOnClickListener** : Definit l'action a executer lorsqu'un utilisateur appuie sur le bouton.
3.  **Toast.makeText()** : Cree une notification flottante temporaire.
4.  **setText()** : Met a jour dynamiquement l'affichage du compteur.

---

## Resume du Lab
A la fin de ce lab, nous avons appris a :
*   Structurer une interface avec des composants Android de base.
*   Gerer les evenements de clic.
*   Manipuler l'etat d'une activite (compteur).
*   Utiliser les Toasts pour communiquer avec l'utilisateur.

---
**Developpe par Hajar Chaira - 2026**
