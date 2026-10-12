Activité 1-1 : Injection de dépendances par instanciation statique

Étape 5 & 6: PresentationStatique avec exécution :
<img width="1432" height="942" alt="Capture d&#39;écran 2026-10-12 191728" src="https://github.com/user-attachments/assets/a41a56be-19f5-42c1-a2b0-01c0964c684c" />

Étape 7 : Explication (Question 9,10 et 11)

9. Couplage faible : MetierIMP dépend uniquement d'une interface (IDao) et non d'une classe précise. On peut donc changer de classe DAO sans modifier le code du métier.

10. Inversion de Contrôle : Non, elle n'est pas respectée ici, car c'est le programmeur (via PresentationStatique) qui crée manuellement les objets avec new.

11. Pour éviter cela : Il faudrait déléguer la création des objets à un framework ou un conteneur externe (comme Spring) ou utiliser une configuration dynamique pour que la présentation ne fasse plus les new elle-même.

Activité 1-2 : Injection par instanciation dynamique
Étape 1 : Créer config.txt
<img width="1415" height="477" alt="image" src="https://github.com/user-attachments/assets/e27ad238-22ba-4f84-bb7c-0f80c01bee7a" />

Étape 2 : PresentationDynamique avec exécution :
<img width="1486" height="978" alt="image" src="https://github.com/user-attachments/assets/ca4d4507-b9db-4b45-8201-34f16adbba68" />

Étape 4 : Explication (Question 7,8 et 9)

7. Comment cela illustre l'instanciation dynamique :
Les objets ne sont plus créés avec un new écrit en dur dans le code. Leurs noms sont lus depuis un fichier texte externe (config.txt), puis chargés et créés en mémoire au moment de l'exécution .

8. En quoi cela se rapproche de l'IoC (Inversion de Contrôle) :
Parce que le code Java ne choisit plus directement quelle classe utiliser. Le choix est externalisé dans le fichier de configuration, ce qui commence à déléguer une partie du contrôle hors du code source.

9. Avantages et limites :

Avantages : On peut changer d'implémentation (par exemple changer de DAO) juste en modifiant le fichier config.txt, sans avoir à modifier ni recompiler le code Java.

Limites : Le code avec la réflexion est lourd et complexe à écrire, et la gestion des dépendances reste entièrement manuelle.

Activité 1-3 : Spring avec fichier de configuration XML
Étape 1 : Vérifier les dépendances (pom.xml)
<img width="1442" height="981" alt="image" src="https://github.com/user-attachments/assets/65724dee-ee61-4955-b4a5-dbfc710b1386" />

Étape 2 : Créer config.xml
<img width="1437" height="741" alt="image" src="https://github.com/user-attachments/assets/bad543cd-ba4a-4fe6-a823-e4fcbf7ea5f8" />

Étape 3 : PresentationAvecSpring avec exécution :
<img width="1545" height="972" alt="image" src="https://github.com/user-attachments/assets/78615288-3a25-4c61-8142-bb0e6e9c9efe" />

Étape 5 : Explication (Question 6 et 7)
6. Comparaison : En 1-2, on code manuellement la lecture du fichier et l'instanciation. En 1-3, Spring automatise tout.

7. Les 3 modes :

Manuelle : Avec new (code figé).

Réflexion : Dynamique via un fichier texte (Class.forName).

Spring : Automatisé par un conteneur externe (IoC).

Activité 1-4 : Spring avec annotations
Étape 1 : Annoter DaoIMP
<img width="1446" height="645" alt="image" src="https://github.com/user-attachments/assets/557837be-4a15-4bca-9090-9404a364d09e" />

Étape 2 : Annoter MetierIMP
<img width="1447" height="748" alt="image" src="https://github.com/user-attachments/assets/95ac1a6d-3ddf-4486-bc05-3bad1a847dc3" />

Étape 3 : PresentationAvecAnnotation avec exécution :
<img width="1522" height="980" alt="image" src="https://github.com/user-attachments/assets/edc04671-51e3-4d6a-aecb-ccec7f990d89" />

Étape 5 : Explication (Question 5 et 6)
5. Spring scanne les classes et injecte automatiquement les objets grâce à @Autowired.

6. Plus besoin de fichier XML (tout est dans le code). Le conteneur gère tout de bout en bout (IoC total).
