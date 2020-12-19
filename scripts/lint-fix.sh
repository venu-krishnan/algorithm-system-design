#!/usr/bin/env bash

function go_to_project_dir() {
    local -r script_dir=$(dirname "${BASH_SOURCE[0]}")
    cd "$script_dir/../" || exit 1
}

function lint_fix(){
    ./gradlew ktlintFormat
}

function main(){
    go_to_project_dir
    source scripts/common.sh || exit 1

    common.set_bash_error_handling
    lint_fix
    common.display_success_message "project lint fix ran successfully"
}

main
