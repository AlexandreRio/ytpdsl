YTP DSL
===

A Domain Specific Language to generate videos based on video libraries and some math.

It is inspired by https://github.com/FAMILIAR-project/VideoGen2 and https://twitter.com/acherm video editing DSL.

Main difference is that this project doesn't aim to produce regular video editing but to provide a fun way to generate random sequences at every run.

The language is there to construct a set of inputs to guide the stochastic decisions: total duration of the output clip, number of cuts, type of transition etc.

Backend video editing is based on [ffmpeg](https://ffmpeg.org) and a [java wrapper](https://github.com/bramp/ffmpeg-cli-wrapper). 
For now all the magic happens in `fr.ytpdsl.parent/fr.ytpdsl/`

# Features

# Roadmap

# Contributing
