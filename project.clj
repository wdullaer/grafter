(defproject grafter "0.2.0-SNAPSHOT"
  :description "RDFization tools"
  :url "http://example.com/FIXME"
  :license {:name "TODO"
            :url "http://example.com/TODO"}

  :repositories [["swirrl-private" {:url "s3p://leiningen-private-repo/releases/"
                                    :username :env
                                    :passphrase :env}]]

  :dependencies [[org.clojure/clojure "1.6.0"]
                 ;;[org.apache.jena/jena-core "2.11.1"]
                 [org.clojure/algo.monads "0.1.5"]
                 [clj-time "0.7.0"]
                 [org.clojure/tools.namespace "0.2.4"]
                 [clojure-csv/clojure-csv "2.0.1"]
                 [clj-excel "0.0.1"]
                 [me.raynes/fs "1.4.4"]
                 [org.marianoguerra/clj-rhino "0.2.1"]
                 [org.openrdf.sesame/sesame-runtime "2.7.10"]
                 [potemkin "0.3.4"]
                 ;;[incanter/incanter-core "1.5.5"]
                 [incanter "1.5.5"] ; Include all of incanter
                 ]
  ;;:dev-dependencies [[lein-autodoc "0.9.0"]]

  :codox {:defaults {:doc "FIXME: write docs"}}

  :source-paths ["src"]
  :jvm-opts ["-Dapple.awt.UIElement=true"] ;; Prevent Java process
                                           ;; from appearing as a GUI
                                           ;; app in OSX when Swing
                                           ;; classes are loaded.

  :plugins [[s3-wagon-private "1.1.2"]] ;; private maven repo's on s3

  :profiles {:uberjar {:aot :all}

             :dev {:plugins [[com.aphyr/prism "0.1.1"]  ;; autotest support simply run: lein prism
                             [codox "0.8.9"]]
                   :dependencies [[com.aphyr/prism "0.1.1"]]


                   :env {:dev true}}}
  )
