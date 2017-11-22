# Übung 4

## Aufgabe 1
Entwerfen Sie ein Anwendungsfalldiagramm zu der folgenden Beschreibung:
In einem Kino kann ein Gast Kinokarten an der Kasse kaufen, die vorbestellt sein könnten. Auÿerdem
ist es möglich Popcorn und Getränke zu bestellen. Danach bezahlt der Kunde beim Kassierer die
Rechnung. Es ist auch möglich mit Kreditkarte zu bezahlen, welche bei Bedarf einer automatischen
Prüfung unterzogen werden kann.

## Aufgabe 2
Entwerfen Sie ein Zustandsdiagramm, das folgenden Sachverhalt über die Bestellung eines Blumenstraußes
über das Internet beschreibt:
Die über das Internet aufgegebenen Bestellungen werden zuerst vom Kundencenter überprüft. Sind
die Bestelldaten nicht korrekt oder ist die Bestellung nicht plausibel, so nimmt das Kundencenter mit
dem entsprechenden Kunden Kontakt auf, um die offenen Fragen zu klären. Ist mit der Bestellung alles
in Ordnung, bzw. sind die offenen Fragen geklärt, dann stellt die Floristin mit Hilfe der Bestelldaten
den Strauÿ zusammen. Sobald der Strauÿ fertig ist, wird er vom Lieferdienst an die auf der Bestellung
vermerkte Adresse geliefert.

## Aufgabe 3
Welche der folgenden Aussagen über ein Interface ist korrekt?
1. Ein Interface kann private Attribute besitzen
2. Ein Interface kann andere Interfaces redefinieren
3. Alle Merkmale eines Interface müssen die Sichtbarkeit "private" haben
4. Ein Interface kann keine Attribute haben

## Aufgabe 4
Welche Aussagen sind korrekt?
1. An Interface may be implemented by multiple classifiers, but one classifier may only implement one interface.
2. An Interface may be implemented by multiple classifiers, and one classifier may implement multiple interfaces.
3. An interface may be implemented by at most one classifier, and one classifier may implement at most one interface.
4. An interface may be implemented by at most one classifier, but one classifier may implement multiple interfaces.

## Aufgabe 5
![Aufgabe 5](https://github.com/Reitz86/uebung4/raw/master/aufgabe5.JPG)
Geben Sie in der folgenden Abbildung die Bezeichnungen der dargestellten Elemente an.

## Aufgabe 6
![Aufgabe 6](https://github.com/Reitz86/uebung4/raw/master/aufgabe6.JPG)

1. Sobald w zerstört wird, dann wird auch z zerstört.
2. Sobald z zerstört wird, dann wird auch w zerstört.
3. Zu einem bestimmten Zeitpunkt kann eine Instanz von z in genau einer Instanz von w enthalten sein.
4. Zu einem bestimmten Zeitpunkt kann eine Instanz von z in mehreren Instanzen von w enthalten sein.

## Aufgabe 7

```javagi
function fancyAlert(arg) {
  if(arg) {
    $.facebox({div:'#foo'})
  }
}
```