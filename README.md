# MedDrive App (каркас)

Kotlin + Gradle (JDK 21), мульти-модульный каркас приложения. Репозиторий — инфраструктурный каркас: экраны и домен появятся в задачах спринтов.

## Модули

| Модуль | Назначение |
|---|---|
| `core` | доменные модели и общая логика (сейчас — `AppInfo`) |
| `data` | источники данных (`AppInfoRepository` + заглушка) |
| `app` | точка входа (`com.meddrive.app.MainKt`), сюда же придёт Android-модуль |

## Что уже есть

- Gradle wrapper (`./gradlew`), каталог версий `gradle/libs.versions.toml` (Kotlin 2.1, JUnit 5, ktlint).
- Тесты во всех модулях (JUnit 5), стиль — ktlint (`ktlint_official`, `max_line_length = 120`).
- CI: `.github/workflows/ci.yml` — JDK 21 → `./gradlew build` (компиляция + тесты + ktlint).

## Команды

```bash
./gradlew build      # сборка + тесты + ktlint
./gradlew test       # только тесты
./gradlew ktlintCheck
./gradlew :app:run   # печатает «MedDrive dev»
```

## Что решает новая команда

- **Тестовый контур приложения** (решение отложено по указанию руководителя): Android SDK + эмулятор — отдельным шагом или workflow, когда появится Android-модуль; сейчас проверки идут на JDK-контейнере.
- Пакет `com.meddrive` — рабочий; переименование под заказчика — отдельной задачей.
- Android/KMP-структура (если приложение нативное) — отдельная задача: текущий каркас — чистый Kotlin/JVM.
