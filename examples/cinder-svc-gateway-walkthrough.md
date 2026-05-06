# Cinder Svc Gateway Pipe Walkthrough

The fixture is intentionally compact, so the review starts with the cases that pull farthest apart.

| Case | Focus | Score | Lane |
| --- | --- | ---: | --- |
| baseline | queue pressure | 135 | watch |
| stress | retry load | 126 | watch |
| edge | worker slack | 168 | ship |
| recovery | session drift | 190 | ship |
| stale | queue pressure | 129 | watch |

Start with `recovery` and `stress`. They create the widest contrast in this repository's fixture set, which makes them better review anchors than the middle cases.

The useful comparison is `session drift` against `retry load`, not the raw score alone.
