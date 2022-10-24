**Difficuly:** Hard

---

**Task:** Write a program that mimics the behaviour of a version control system (VCS) like git.

**Features:**
* init: initialize a repository
* commit: save the current changes in the directory, don't save a complete snapshot of the folder (see diff)
* checkout: edit all files in the folder in order to reflect the state of the folder at the time a certain commit was made
* diff: view what changes would be saved with a commit
* status: get information about what files were changed/added/deleted


**Usage example:**
|Command|Subcommand|Argument|Example output|
|------|----|-|-|
|better-git|init||Repo initialized at .better-git|
|better-git|status||progettoASD.java was changed|
|better-git|commit|"Commit bello :)"|5 files committed|
|better-git|checkout|abcd1234|Checking out commit abcd1234|
|better-git|diff||sofferenza.java: blablabla|


