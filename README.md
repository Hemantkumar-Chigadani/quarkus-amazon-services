# Quarkus Amazon Services
<!-- ALL-CONTRIBUTORS-BADGE:START - Do not remove or modify this section -->
[![All Contributors](https://img.shields.io/badge/all_contributors-18-orange.svg?style=flat-square)](#contributors-)
<!-- ALL-CONTRIBUTORS-BADGE:END -->

[![Version](https://img.shields.io/maven-central/v/io.quarkiverse.amazonservices/quarkus-amazon-services-bom?logo=apache-maven&style=flat-square)](https://search.maven.org/artifact/io.quarkiverse.amazonservices/quarkus-amazon-services-bom)

## Introduction

This set of extensions allows you to interact with some of the AWS Services namely:

 * Cognito User Pools
 * DynamoDB / DynamoDB Enhanced
 * IAM
 * KMS
 * S3
 * Secrets Manager
 * SES
 * SNS
 * SQS
 * SSM

They also provide a common infrastructure to make it easy to add new ones.

Each extension provides configuration properties to configure the clients and wires everything via CDI injection.

## Compatibility

Quarkus GitHub App provides two different version streams, one compatible with Quarkus 2.x and the other compatible with Quarkus 3.x.

| Quarkus | Quarkus GitHub App | Documentation                                                                                          |
|---------|--------------------|--------------------------------------------------------------------------------------------------------|
| 2.x     | 1.6.x              | [Documentation](https://quarkiverse.github.io/quarkiverse-docs/quarkus-amazon-services/1.x/index.html) |
| 3.x     | 2.x                | [Documentation](https://quarkiverse.github.io/quarkiverse-docs/quarkus-amazon-services/dev/index.html) |

Use the latest version of the corresponding stream, [the list of versions is available on Maven Central](https://search.maven.org/artifact/io.quarkiverse.amazonservices/quarkus-amazon-services-bom).

## Documentation

The documentation for this extension can be found [here](https://quarkiverse.github.io/quarkiverse-docs/quarkus-amazon-services/dev/index.html) - or [here](https://quarkiverse.github.io/quarkiverse-docs/quarkus-amazon-services/dev/index.html) for a version compatible with Quarkus 3.

## Contributors ✨

Thanks goes to these wonderful people ([emoji key](https://allcontributors.org/docs/en/emoji-key)):

<!-- ALL-CONTRIBUTORS-LIST:START - Do not remove or modify this section -->
<!-- prettier-ignore-start -->
<!-- markdownlint-disable -->
<table>
  <tbody>
    <tr>
      <td align="center" valign="top" width="14.28%"><a href="https://github.com/marcinczeczko"><img src="https://avatars.githubusercontent.com/u/4218395?v=4?s=100" width="100px;" alt="Marcin Czeczko"/><br /><sub><b>Marcin Czeczko</b></sub></a><br /><a href="https://github.com/quarkiverse/quarkus-amazon-services/commits?author=marcinczeczko" title="Code">💻</a> <a href="#maintenance-marcinczeczko" title="Maintenance">🚧</a></td>
      <td align="center" valign="top" width="14.28%"><a href="https://lesincroyableslivres.fr/"><img src="https://avatars.githubusercontent.com/u/1279749?v=4?s=100" width="100px;" alt="Guillaume Smet"/><br /><sub><b>Guillaume Smet</b></sub></a><br /><a href="https://github.com/quarkiverse/quarkus-amazon-services/commits?author=gsmet" title="Code">💻</a> <a href="#maintenance-gsmet" title="Maintenance">🚧</a></td>
      <td align="center" valign="top" width="14.28%"><a href="https://github.com/corentinarnaud"><img src="https://avatars.githubusercontent.com/u/15332003?v=4?s=100" width="100px;" alt="Corentin Arnaud"/><br /><sub><b>Corentin Arnaud</b></sub></a><br /><a href="https://github.com/quarkiverse/quarkus-amazon-services/commits?author=corentinarnaud" title="Code">💻</a></td>
      <td align="center" valign="top" width="14.28%"><a href="http://oscerd.github.io"><img src="https://avatars.githubusercontent.com/u/5106647?v=4?s=100" width="100px;" alt="Andrea Cosentino"/><br /><sub><b>Andrea Cosentino</b></sub></a><br /><a href="https://github.com/quarkiverse/quarkus-amazon-services/commits?author=oscerd" title="Code">💻</a></td>
      <td align="center" valign="top" width="14.28%"><a href="https://github.com/emattheis"><img src="https://avatars.githubusercontent.com/u/18270192?v=4?s=100" width="100px;" alt="Erik Mattheis"/><br /><sub><b>Erik Mattheis</b></sub></a><br /><a href="https://github.com/quarkiverse/quarkus-amazon-services/commits?author=emattheis" title="Code">💻</a></td>
      <td align="center" valign="top" width="14.28%"><a href="https://github.com/famod"><img src="https://avatars.githubusercontent.com/u/22860528?v=4?s=100" width="100px;" alt="Falko Modler"/><br /><sub><b>Falko Modler</b></sub></a><br /><a href="https://github.com/quarkiverse/quarkus-amazon-services/commits?author=famod" title="Code">💻</a></td>
      <td align="center" valign="top" width="14.28%"><a href="https://github.com/stuartwdouglas"><img src="https://avatars.githubusercontent.com/u/328571?v=4?s=100" width="100px;" alt="Stuart Douglas"/><br /><sub><b>Stuart Douglas</b></sub></a><br /><a href="https://github.com/quarkiverse/quarkus-amazon-services/commits?author=stuartwdouglas" title="Code">💻</a></td>
    </tr>
    <tr>
      <td align="center" valign="top" width="14.28%"><a href="https://github.com/kdubb"><img src="https://avatars.githubusercontent.com/u/787655?v=4?s=100" width="100px;" alt="Kevin Wooten"/><br /><sub><b>Kevin Wooten</b></sub></a><br /><a href="https://github.com/quarkiverse/quarkus-amazon-services/commits?author=kdubb" title="Code">💻</a></td>
      <td align="center" valign="top" width="14.28%"><a href="https://resume.fedorenko-d.ru/"><img src="https://avatars.githubusercontent.com/u/587257?v=4?s=100" width="100px;" alt="Fedorenko Dmitrij"/><br /><sub><b>Fedorenko Dmitrij</b></sub></a><br /><a href="https://github.com/quarkiverse/quarkus-amazon-services/commits?author=c0va23" title="Code">💻</a></td>
      <td align="center" valign="top" width="14.28%"><a href="https://www.inulogic.fr"><img src="https://avatars.githubusercontent.com/u/88554524?v=4?s=100" width="100px;" alt="Sébastien CROCQUESEL"/><br /><sub><b>Sébastien CROCQUESEL</b></sub></a><br /><a href="https://github.com/quarkiverse/quarkus-amazon-services/commits?author=scrocquesel" title="Code">💻</a> <a href="#maintenance-scrocquesel" title="Maintenance">🚧</a></td>
      <td align="center" valign="top" width="14.28%"><a href="https://github.com/hamburml"><img src="https://avatars.githubusercontent.com/u/7239350?v=4?s=100" width="100px;" alt="Michael Hamburger"/><br /><sub><b>Michael Hamburger</b></sub></a><br /><a href="https://github.com/quarkiverse/quarkus-amazon-services/commits?author=hamburml" title="Code">💻</a></td>
      <td align="center" valign="top" width="14.28%"><a href="https://www.nithanim.me/"><img src="https://avatars.githubusercontent.com/u/2402064?v=4?s=100" width="100px;" alt="Nithanim"/><br /><sub><b>Nithanim</b></sub></a><br /><a href="https://github.com/quarkiverse/quarkus-amazon-services/commits?author=Nithanim" title="Code">💻</a></td>
      <td align="center" valign="top" width="14.28%"><a href="https://github.com/Temdegon"><img src="https://avatars.githubusercontent.com/u/708289?v=4?s=100" width="100px;" alt="Pavel"/><br /><sub><b>Pavel</b></sub></a><br /><a href="https://github.com/quarkiverse/quarkus-amazon-services/commits?author=Temdegon" title="Code">💻</a></td>
      <td align="center" valign="top" width="14.28%"><a href="https://github.com/dagrammy"><img src="https://avatars.githubusercontent.com/u/14089875?v=4?s=100" width="100px;" alt="dagrammy"/><br /><sub><b>dagrammy</b></sub></a><br /><a href="https://github.com/quarkiverse/quarkus-amazon-services/commits?author=dagrammy" title="Code">💻</a></td>
    </tr>
    <tr>
      <td align="center" valign="top" width="14.28%"><a href="https://github.com/ranjanashish"><img src="https://avatars.githubusercontent.com/u/113700?v=4?s=100" width="100px;" alt="Ashish Ranjan"/><br /><sub><b>Ashish Ranjan</b></sub></a><br /><a href="https://github.com/quarkiverse/quarkus-amazon-services/commits?author=ranjanashish" title="Code">💻</a></td>
      <td align="center" valign="top" width="14.28%"><a href="https://github.com/thiko"><img src="https://avatars.githubusercontent.com/u/4712764?v=4?s=100" width="100px;" alt="thiko"/><br /><sub><b>thiko</b></sub></a><br /><a href="https://github.com/quarkiverse/quarkus-amazon-services/commits?author=thiko" title="Code">💻</a></td>
      <td align="center" valign="top" width="14.28%"><a href="http://surunairdejava.com"><img src="https://avatars.githubusercontent.com/u/1970634?v=4?s=100" width="100px;" alt="Cedric Thiebault"/><br /><sub><b>Cedric Thiebault</b></sub></a><br /><a href="https://github.com/quarkiverse/quarkus-amazon-services/commits?author=cthiebault" title="Code">💻</a></td>
      <td align="center" valign="top" width="14.28%"><a href="https://github.com/krisgerhard"><img src="https://avatars.githubusercontent.com/u/11822359?v=4?s=100" width="100px;" alt="Kris-Gerhard"/><br /><sub><b>Kris-Gerhard</b></sub></a><br /><a href="https://github.com/quarkiverse/quarkus-amazon-services/commits?author=krisgerhard" title="Code">💻</a></td>
    </tr>
  </tbody>
</table>

<!-- markdownlint-restore -->
<!-- prettier-ignore-end -->

<!-- ALL-CONTRIBUTORS-LIST:END -->

This project follows the [all-contributors](https://github.com/all-contributors/all-contributors) specification. Contributions of any kind welcome!
