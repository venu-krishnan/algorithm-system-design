#!/usr/bin/env bash

function common.set_bash_error_handling() {
    set -o errexit
    set -o errtrace
    set -o nounset
    set -o pipefail
}

function common.go_to_project_dir() {
    local -r script_dir=$(dirname "${BASH_SOURCE[0]}")
    cd "$script_dir/../../" || exit 1
}

function common.display_success_message() {
    local -r message=$1
    local -r green_color_code='\033[1;32m'
    local -r default_color_code='\033[00m'
    echo -e "${green_color_code}\\n${message}, 🍻${default_color_code} \\n"
}

