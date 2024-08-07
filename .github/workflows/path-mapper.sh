#!/bin/bash

case "$1" in
  "OptionOne")
    echo "working-directory=components/option-one" >> $GITHUB_OUTPUT
    ;;
  "OptionTwo")
    echo "working-directory=components/option-two" >> $GITHUB_OUTPUT
    ;;
  "OptionThree")
    echo "working-directory=components/option-three" >> $GITHUB_OUTPUT
    ;;
  *)
    echo "::error::Unknown component name: $1"
    exit 1
    ;;
esac