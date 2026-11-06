# Publish the Learning Website on GitHub Pages

## 1. Update the GitHub username

Replace `YOUR_GITHUB_USERNAME` in:
- `mkdocs.yml` (`site_url`, `repo_name`, `repo_url`, social link)
- `docs/index.md` (source-code button)

Use your actual GitHub username. Keep the repository name `springboot-practical-learning` if that is the repository you create.

## 2. Preview locally (Windows PowerShell)

```powershell
py -m venv .venv
.\.venv\Scripts\Activate.ps1
python -m pip install -r requirements.txt
python -m mkdocs serve
```

Open `http://127.0.0.1:8000`.

To build the static site:

```powershell
python -m mkdocs build --strict
```

The generated website is placed in `site/`. Do not commit `site/`; GitHub Actions builds it.

## 3. Push the project to GitHub

If this folder is not already a Git repository:

```powershell
git init
git add .
git commit -m "feat(docs): add Spring Boot learning website"
git branch -M main
git remote add origin https://github.com/YOUR_GITHUB_USERNAME/springboot-practical-learning.git
git push -u origin main
```

If the repository already exists, update its remote if necessary, then run:

```powershell
git add .
git commit -m "feat(docs): add colorful MkDocs learning portal"
git push
```

## 4. Enable GitHub Pages

1. Open the repository on GitHub.
2. Go to **Settings → Pages**.
3. Under **Build and deployment → Source**, select **GitHub Actions**.
4. Open the **Actions** tab and watch `Deploy Spring Boot Learning Website`.
5. When deployment succeeds, open the URL shown by the workflow. It should be:
   `https://YOUR_GITHUB_USERNAME.github.io/springboot-practical-learning/`

## 5. Daily workflow

Edit Markdown in `docs/` or Java code in the module folders. Commit and push. Changes to the docs trigger website deployment automatically.

## Notes

- GitHub Pages serves the documentation as a static site. It does not run Spring Boot APIs, databases, Redis or Kafka.
- The source code remains in the same GitHub repository and is linked from the learning pages.
- If your default branch is not `main`, update the workflow trigger.
