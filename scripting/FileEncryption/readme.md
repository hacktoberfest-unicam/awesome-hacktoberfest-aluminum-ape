**Autore:** Francesco Valentini

**Difficoltà:** media

**Categoria:** scripting

---

**Consegna:** Scrivi un programma con un linguaggio a tua scelta tra quelli autorizzati che consenta di:
- Cifrare e decifrare un file utilizzando la tecnica One Time Pad
	- Aggiornare automaticamente la chiave una volta utilizzata
	- Prima di cifrare o decifrare verificare che la lunghezza della chiave sia sufficiente
- Generare una chiave randomica di lunghezza N

**Come funziona la tecnica One Time Pad (OTP):** Il nome OTP suggerisce che per utilizzarla in maniera corretta e sicura è necessario **NON RIUTILIZZARE MAI LA STESSA CHIAVE**. 
Inoltre la chiave deve avere la stessa lunghezza del messaggio.

**XOR:** il modo più semplice per criptare una sequenza di bit generica è utilizzare l'operatore logico XOR che secondo la sua tabella di verità:
|A|B|A $\oplus$ B|
|-|-|-------|
|0|0|0|
|0|1|1|
|1|0|1|
|1|1|0|

**Come utilizzare un cifrario XOR**
1) Generiamo una chiave random della stessa lunghezza del nostro messaggio
2) Mettiamo in XOR i bit del nostro messaggio con quelli della nostra chiave
3) **NON RIUTILIZZARE LA CHIAVE PER CRIPTARE ALTRI MESSAGGI**
- **Esempio**:
	- **Chiave:** 11001100100101001110101110100010
	- **Dati:**      01110100011001010111001101110100
	- **Risultato:** 10111000111100011001100011010110 (dati $\oplus$ chiave = datiCriptati)
	- Per **decifrare** si procede con  (datiCriptati $\oplus$ chiave = dati)

**Valori di prova:**
|Chiave|Dati|Risultato atteso|
|------|----|----------------|
|cf300ac9df2bb34374f4c968ca5b8869|746573742070726F7661|bb5579bdff5bc12c0295|
