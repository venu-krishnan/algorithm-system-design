#!/usr/bin/env bash

function go_to_project_dir() {
    local -r script_dir=$(dirname "${BASH_SOURCE[0]}")
    cd "$script_dir/../" || exit 1
}

function lint(){
    ./gradlew ktlint
}

function main(){
    go_to_project_dir
    source scripts/common.sh || exit 1

    common.set_bash_error_handling
    lint
    common.display_success_message "project linted successfully"
}

main
