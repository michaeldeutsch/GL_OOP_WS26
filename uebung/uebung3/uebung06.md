# Übung 6 – Kapazitätsbeschränkte Assoziation

**Thema:** Validierung und Begrenzung bei Objektbeziehungen

Erstelle eine Klasse `Kurs` mit den Attributen `titel`, `maxTeilnehmer` (`int`) und einer `ArrayList<Student>` für angemeldete Studenten.
Die Klasse `Student` besitzt `matrikelNr` und `name`.

Implementiere im `Kurs` die Methode `boolean anmelden(Student student)`:
- Die Methode prüft, ob der Student bereits angemeldet ist oder die maximale Teilnehmeranzahl erreicht ist.
- Ist noch Platz und der Student nicht enthalten, wird er hinzugefügt und `true` zurückgegeben.
- Andernfalls wird eine aussagekräftige Meldung ausgegeben und `false` zurückgegeben.

**Fertig, wenn:** Anmeldungen bis zur Obergrenze akzeptiert und überzählige oder doppelte Anmeldungen korrekt abgewiesen werden.
