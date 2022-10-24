
**Difficuly:** High

---

**Task:** Write a program that mimics the behaviour of rsync. The program must:
- Synchronize files between different folders
- Either take single files or entire folders as arguments
- Synchronize files between different machines
- Produce meaningful logging output when the -v flag is used

**How does rsync work?:** rsync works by establishing a connection to the target machine and then copying updated files to or from the target machine.

**Usage example:**

**Valori di prova:**
|Command|Local file/directory|Remote file/directory|
|------|----|----------------|
|rsync|tesi.tex|192.168.1.42::tesi.tex|
|rsync|nuclear_codes/|www.usa.gov::nuclear_codes/|
