# UŽDUOTIS
Šiuo metu įmonėje *Telesoftas* dirba 150 žmonių. Jie visi per dieną vidutiniškai išgeria 122 puodelius *cappuccino* kavos, kurią sudaro 11619 ml pieno ir 1714 g kavos pupelių.
Įgyvendink pirmąją (o jei ji pasirodys per lengva, dar ir antrąją) užduotį (-is):
1. Pabaik realizuoti *cappuccino* kavos skaičiuoklę, kuri, pagal Tavo vidutiniškai per dieną išgeriamų kavos puodelių skaičių (darom prielaidą, kad Tu ją geri!), suskaičiuotų, kiek gramų kavos ir mililitrų pieno Tu per dieną suvartoji. (Pagal tai, kiek gramų kavos ir mililitrų pieno sunaudojama *Telesofto* kavos puodeliui padaryti).
2. Jei ir tu pradėtum dirbti įmonėje *Telesoftas*, koks būtų vidutinis per dieną suvartojamas kavos ir pieno kiekis, tenkantis vienam įmonės darbuotojui?

Jei turi klausimų dėl užduoties atlikimo, rašyk el. paštu <code-academy-kaunas@telesoftas.com> arba sukurk naują [Issue](https://github.com/TeleSoftas/code-academy-capuccino/issues).

# Žingsniai užduoties atlikimui:

## 1. Projekto parsisiuntimas
Viršuje paspausti *Clone or download* mygtuką, spustelėti *Download ZIP* (1 pav.) ir išskleisti parsisiųstą *code-academy-cappuccino-master.zip* failą.

![1 pav.](/docs/1pav.png)

1 pav.


## 2. *Java* įdiegimas

Parsisiųsti ir įsidiegti *Java Development Kit (JDK)* iš puslapio <http://www.oracle.com/technetwork/java/javase/downloads/>.

## 3. *Eclipse IDE* paleidimas:

*Eclipse* – tai atviro kodo integruota kūrimo aplinka, kurią galima parsisiųsti iš <http://www.eclipse.org/downloads/eclipse-packages/>. Pasirinkti *Eclipse IDE for Java EE Developers* bei atitinkamą Tavo naudojamą operacinę sistemą (*Windows*, *Linux* ar *Mac OS*).

### 3.1 *Windows* aplinkoje
Paspaudus *download* mygtuką, į asmeninį kompiuterį bus parsiųstas *&ast;.zip* failas. Išskleidus jį, paleisti *eclipse.exe* failą.

### 3.2 *Mac OS* aplinkoje
Paspaudus *download* mygtuką, į asmeninį kompiuterį bus parsiųstas *&ast;.dmg* (arba *&ast;tar.gz*, jei siunčiama senesnė *Eclipse* versija) failas. Įdiegti *Eclipse*, nutempiant katalogą į *Applications* direktoriją, ir paspausti *Eclipse* piktogramą.

### 3.3 *Ubuntu Linux* aplinkoje
Paspaudus *download* mygtuką, į asmeninį kompiuterį bus parsiųstas *&ast;tar.gz* failas. Išskleidus jį ir atidarius *eclipse-installer* katalogą, paspausti ant *eclipse-inst* dešinį pelės klavišą ir pasirinkti *Run* (arba *terminal* lange įvykdyti *nautilus -q* komandą).

Pirmąkart paleidus *Eclipse IDE* (arba paleidžiant ją kiekvienąkart, jei nėra pažymėta varnelė *Use this as the default and do not ask again*), pasirinkti darbo aplinkos (*angl. workspace*) saugojimo vietą (2 pav.).

![2 pav.](/docs/2pav.png)

2 pav.

## 4. *Web* aplikacijos paleidimas

Paspaudus *Launch* mygtuką, pasirodžiusiame lange spustelėti *Import existing projects* nuorodą (3 pav.)

![3 pav.](/docs/3pav.png)

3 pav.

Atsivėrusiame lange pasirinkti išsaugoto projekto *code-academy-cappuccino-master* katalogą. *Project Explorer* dalyje ant projekto pavadinimo spustelėjus dešinį pelės klavišą, pasirinkti *Gradle -> Refresh Gradle Project* (4 pav.).
 
![4 pav.](/docs/4pav.png)

4 pav.

*Project Explorer* dalyje du kartus spustelėjus kairįjį pelės mygtuką, atverti `src/main/java/com/telesoftas/drinkingcappuccino/DrinkingCappuccinoApplication.java`. Įrankių juostoje spustelėjus *Run* mygtuką, paleisti aplikaciją (*Run As Java Application*) (5 pav.).

![5 pav.](/docs/5pav.png)

5 pav.

Taip pat, aplikaciją galima paleisti ant `DrinkingCappuccinoApplication.java` paspaudus dešinį pelės klavišą ir pasirinkus *Run As -> Java Application* (6 pav.).

![6 pav.](/docs/6pav.png)

6 pav.

Beje, gali būti, kad projekto failus bus patogiau peržiūrėti *Navigator* (o ne *Project Explorer*) dalyje (7 ir 8 pav.):

![7 pav.](/docs/7pav.png)

7 pav.

![8 pav.](/docs/8pav.png)

8 pav.


Pasirinktos interneto naršyklės adresų juostoje suvesti: <http://localhost:8080/cappuccino> (9 pav.).

![9 pav.](/docs/9pav.png)

9 pav.

Pirmajai užduočiai įgyvendinti reikalingas failas: `src/main/java/com/telesoftas/drinkingcappuccino/calculators/CalculatorLevel1.java`. Atvėrus jį, realizuoti metodus, kuriuose yra komentaras *//TODO* (10 pav.).

Antrajai užduočiai reikalingas failas: `src/main/java/com/telesoftas/drinkingcappuccino/calculators/CalculatorLevel2.java`. Atvėrus jį, taip pat realizuoti metodus, kuriuose yra komentaras *//TODO*.

![10 pav.](/docs/10pav.png)

10 pav.


**Atlikus užduotis, suarchyvuoti visus projekto failus ir atsiųsti el. paštu <code-academy-kaunas@telesoftas.com>.**
