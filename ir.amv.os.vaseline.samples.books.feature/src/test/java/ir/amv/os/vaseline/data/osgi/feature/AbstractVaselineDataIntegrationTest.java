package ir.amv.os.vaseline.data.osgi.feature;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.ops4j.pax.exam.Configuration;
import org.ops4j.pax.exam.Option;
import org.ops4j.pax.exam.junit.PaxExam;
import org.ops4j.pax.exam.karaf.options.LogLevelOption;
import org.ops4j.pax.exam.options.MavenArtifactUrlReference;
import org.ops4j.pax.exam.options.MavenUrlReference;
import org.ops4j.pax.exam.spi.reactors.ExamReactorStrategy;
import org.ops4j.pax.exam.spi.reactors.PerClass;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

import javax.inject.Inject;
import java.io.File;

import static org.ops4j.pax.exam.CoreOptions.maven;
import static org.ops4j.pax.exam.CoreOptions.mavenBundle;
import static org.ops4j.pax.exam.karaf.options.KarafDistributionOption.configureConsole;
import static org.ops4j.pax.exam.karaf.options.KarafDistributionOption.debugConfiguration;
import static org.ops4j.pax.exam.karaf.options.KarafDistributionOption.features;
import static org.ops4j.pax.exam.karaf.options.KarafDistributionOption.karafDistributionConfiguration;
import static org.ops4j.pax.exam.karaf.options.KarafDistributionOption.keepRuntimeFolder;
import static org.ops4j.pax.exam.karaf.options.KarafDistributionOption.logLevel;

/**
 * @author Amir
 */
@RunWith(PaxExam.class)
@ExamReactorStrategy(PerClass.class)
public class AbstractVaselineDataIntegrationTest {

    @Inject
    protected BundleContext bundleContext;

    @Test
    public void test() {
        Bundle[] bundles = bundleContext.getBundles();
        for (Bundle bundle : bundles) {
            System.out.println("bundle.getSymbolicName() = " + bundle.getSymbolicName());
        }
    }


    protected String[] getTestFeatures() {
        return new String[] {
                "ir.amv.os.vaseline.samples.books.feature"
        };
    }

    @Configuration
    public Option[] config() {
        MavenArtifactUrlReference karafUrl = maven()
                .groupId(getKarafGroupId())
                .artifactId(getKarafArtifactId())
                .version(getKarafVersion())
                .type("zip");

        MavenUrlReference karafStandardRepo = maven()
                .groupId(getFeaturesGroupId())
                .artifactId(getFeaturesArtifactId())
                .version(getFeaturesVersion())
                .classifier("features")
                .type("xml");
        File unpackDirectory = new File("target", "exam");
        return new Option[]{
                // KarafDistributionOption.debugConfiguration("5005", true),
                karafDistributionConfiguration()
                        .frameworkUrl(karafUrl)
                        .unpackDirectory(unpackDirectory)
                        .useDeployFolder(false),
                keepRuntimeFolder(),
                configureConsole().ignoreLocalConsole(),
                mavenBundle()
                        .groupId("org.apache.geronimo.specs")
                        .artifactId("geronimo-jpa_2.1_spec")
                        .version("1.0-alpha-1")
                        .start(),
                mavenBundle()
                        .groupId("com.github.amirmv2006.basics.osgi")
                        .artifactId("vaseline-basics-ogsi-testing-util")
                        .version("1.0-SNAPSHOT")
                        .start(),
                features(karafStandardRepo, getTestFeatures()),
                logLevel(LogLevelOption.LogLevel.INFO),
                debugConfiguration("5555", false)
        };
    }

    protected String getFeaturesVersion() {
        return System.getProperty("vasline.data.features.version", "1.0-SNAPSHOT");
    }

    protected String getFeaturesArtifactId() {
        return System.getProperty("vasline.data.features.artifactId", "ir.amv.os.vaseline.samples.books.feature");
    }

    protected String getFeaturesGroupId() {
        return System.getProperty("vasline.data.features.groupId", "ir.amv.os.vaseline.samples");
    }

    protected String getKarafVersion() {
        return System.getProperty("org.apache.karaf.version", "4.1.2");
    }

    protected String getKarafArtifactId() {
        return System.getProperty("org.apache.karaf.artifactId", "apache-karaf");
    }

    protected String getKarafGroupId() {
        return System.getProperty("org.apache.karaf.groupId", "org.apache.karaf");
    }

}
