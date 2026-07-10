# Git Hands-on (Git-HOL 1–5)

These five labs cover Git configuration, ignoring files, branching/merging,
conflict resolution, and cleanup/push. Below are the exact commands for each.

---

## Git-HOL 1 — Configuration, staging, commit, push/pull

Configure your identity and default editor, then add a file to a repository.

```bash
# One-time machine setup
git config --global user.name  "Your Name"
git config --global user.email "you@example.com"
git config --global core.editor "notepad++ -multiInst -notabbar -nosession -noPlugin"

# Verify configuration
git config --list

# Start a repository and add a file
mkdir my-repo && cd my-repo
git init
echo "Hello Git" > readme.txt
git status                 # untracked file shown
git add readme.txt         # stage the file
git commit -m "Add readme" # commit to local repo

# Connect to a remote and push
git remote add origin <remote-url>
git push -u origin master  # push commits to remote
git pull origin master     # fetch + merge remote changes
```

---

## Git-HOL 2 — .gitignore

Ignore unwanted files and folders (build output, logs, IDE files).

```bash
# Create a .gitignore file
cat > .gitignore << 'EOF'
target/
node_modules/
*.log
*.class
.idea/
.vscode/
EOF

git add .gitignore
git commit -m "Add gitignore"
# Files matching the patterns will no longer appear in `git status`.
```

A sample `.gitignore` is included in this folder.

---

## Git-HOL 3 — Branching and merging

Create a branch, make changes, and merge it back into master.

```bash
git branch feature-1          # create a branch
git checkout feature-1        # switch to it   (or: git switch feature-1)
# ...edit files...
git add .
git commit -m "Work on feature-1"

git checkout master           # go back to master
git merge feature-1           # merge the branch in
git branch -d feature-1       # delete the merged branch
```

---

## Git-HOL 4 — Conflict resolution

When master and a branch change the same lines, Git reports a conflict.

```bash
# Verify master is clean
git status

# Create branch and add hello.xml
git checkout -b GitWork
echo "<msg>branch version</msg>" > hello.xml
git add hello.xml && git commit -m "branch change"

# Make a conflicting change on master
git checkout master
echo "<msg>master version</msg>" > hello.xml
git add hello.xml && git commit -m "master change"

# Attempt the merge -> conflict
git merge GitWork
# Git marks the conflict inside hello.xml with:
#   <<<<<<< HEAD
#   master version
#   =======
#   branch version
#   >>>>>>> GitWork
# Edit the file to keep the correct content, remove the markers, then:
git add hello.xml
git commit -m "Resolve merge conflict in hello.xml"
```

---

## Git-HOL 5 — Cleanup and push back to remote

```bash
# Verify master is clean and list branches
git status
git branch -a                 # list all local + remote branches

# Delete stale local branches after merging
git branch -d GitWork

# Push the cleaned-up master back to the remote
git push origin master

# Optionally prune remote-tracking branches that no longer exist
git fetch --prune
```
