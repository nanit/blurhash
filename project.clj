(defproject blurhash "0.0.1"
  :description "A Clojure(Script) implementation of the blurhash algorithm"
  :url "http://github.com/siili-core/blurhash"
  :license {:name "MIT License"
            :url "https://github.com/siili-core/blurhash/blob/master/LICENSE"}
  :dependencies [[org.clojure/clojure "1.10.0"]]
  :aliases {"analyze" ["eastwood" "{:linters [:unused-namespaces]}"]}
  :plugins [[jonase/eastwood "0.3.5"]]
  :deploy-repositories [["clojars" {:url "https://clojars.org/repo"
                                    :username :env/clojars_username
                                    :password :env/clojars_password
                                    :sign-releases false}]]
  :repl-options {:init-ns blurhash.core})
