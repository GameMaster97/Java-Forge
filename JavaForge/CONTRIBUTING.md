# Contributing to JavaForge

Thank you for considering a contribution!

## Before you start
1. Browse open issues and choose a task.
2. Comment on the issue describing your plan; wait for maintainer confirmation before doing substantial work.
3. For a new feature or behavior change, open an issue first so the scope can be agreed upon.

## Local setup
- Install JDK 17+ and Maven 3.8+.
- Fork the repository and clone your fork.
- Create a branch: `git switch -c feature/short-description`
- Run the tests: `mvn test`

## Pull request process
1. Make a focused change that addresses one issue.
2. Add or update JUnit tests.
3. Run `mvn test` and ensure it passes.
4. Commit with a clear message.
5. Open a PR against the `main` branch and reference the issue (for example, `Closes #12`).

## Quality guidelines
- Use clear names and standard Java formatting.
- Avoid unrelated changes and new dependencies unless justified.
- Document public methods and edge-case behavior.
- Never include credentials, personal data, or generated build output (`target/`).

Maintainers may request changes before merging. Submitting a PR does not guarantee acceptance.
