package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ParexusFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart Bodyfront;
	private final ModelPart Bodyfrontslope;
	private final ModelPart Bigdorsalspinebase;
	private final ModelPart Bigdorsalspineend;
	private final ModelPart Dorsalspineserrations;
	private final ModelPart Head;
	private final ModelPart Headfront;
	private final ModelPart Nose;
	private final ModelPart Upperjaw;
	private final ModelPart Headslope;
	private final ModelPart Lowerjaw;
	private final ModelPart Bodymiddle;
	private final ModelPart Bodyend;
	private final ModelPart Bodyendslope;
	private final ModelPart Tailbase;
	private final ModelPart Tailbaseslope;
	private final ModelPart Seconddorsalfin;
	private final ModelPart Tailmiddle;
	private final ModelPart Tailend;
	private final ModelPart Tailfin;
	private final ModelPart Analfin;
	private final ModelPart Rightpelvicfin;
	private final ModelPart Firstdorsalfin;
	private final ModelPart Bellyspines;
	private final ModelPart Leftpectoralspinebase;
	private final ModelPart Leftpectoralspineend;
	private final ModelPart Rightpectoralspinebase;
	private final ModelPart Rightpectoralspineend;

	public ParexusFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.Bodyfront = this.root.getChild("Bodyfront");
		this.Bodyfrontslope = this.Bodyfront.getChild("Bodyfrontslope");
		this.Bigdorsalspinebase = this.Bodyfrontslope.getChild("Bigdorsalspinebase");
		this.Bigdorsalspineend = this.Bigdorsalspinebase.getChild("Bigdorsalspineend");
		this.Dorsalspineserrations = this.Bigdorsalspineend.getChild("Dorsalspineserrations");
		this.Head = this.Bodyfront.getChild("Head");
		this.Headfront = this.Head.getChild("Headfront");
		this.Nose = this.Headfront.getChild("Nose");
		this.Upperjaw = this.Headfront.getChild("Upperjaw");
		this.Headslope = this.Head.getChild("Headslope");
		this.Lowerjaw = this.Head.getChild("Lowerjaw");
		this.Bodymiddle = this.Bodyfront.getChild("Bodymiddle");
		this.Bodyend = this.Bodymiddle.getChild("Bodyend");
		this.Bodyendslope = this.Bodyend.getChild("Bodyendslope");
		this.Tailbase = this.Bodyend.getChild("Tailbase");
		this.Tailbaseslope = this.Tailbase.getChild("Tailbaseslope");
		this.Seconddorsalfin = this.Tailbaseslope.getChild("Seconddorsalfin");
		this.Tailmiddle = this.Tailbase.getChild("Tailmiddle");
		this.Tailend = this.Tailmiddle.getChild("Tailend");
		this.Tailfin = this.Tailend.getChild("Tailfin");
		this.Analfin = this.Tailbase.getChild("Analfin");
		this.Rightpelvicfin = this.Bodyend.getChild("Rightpelvicfin");
		this.Firstdorsalfin = this.Bodymiddle.getChild("Firstdorsalfin");
		this.Bellyspines = this.Bodymiddle.getChild("Bellyspines");
		this.Leftpectoralspinebase = this.Bodyfront.getChild("Leftpectoralspinebase");
		this.Leftpectoralspineend = this.Leftpectoralspinebase.getChild("Leftpectoralspineend");
		this.Rightpectoralspinebase = this.Bodyfront.getChild("Rightpectoralspinebase");
		this.Rightpectoralspineend = this.Rightpectoralspinebase.getChild("Rightpectoralspineend");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 104).addBox(0.0879F, -1.0F, -48.7679F, 29.0F, 2.0F, 49.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-33.5F, -1.0F, 7.0F, 0.0F, -0.4189F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(102, 104).addBox(-11.0334F, -1.0F, -0.1185F, 11.0F, 2.0F, 55.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(22.5F, -1.0F, 29.0F, 0.0F, -3.0107F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-0.0954F, -1.0F, -43.7143F, 29.0F, 2.0F, 53.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-24.5F, -1.0F, 6.0F, 0.0F, -1.4399F, 0.0F));

		PartDefinition cube_r4 = fossil.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 56).addBox(-20.5F, -1.0F, -32.0F, 41.0F, 2.0F, 45.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.5F, -1.0F, -1.0F, 0.0F, -0.2618F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(3.0F, -24.0F, -1.0F));

		PartDefinition Bodyfront = root.addOrReplaceChild("Bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 17.0F, -6.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition Bodyfront_r1 = Bodyfront.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -4.0F, -4.5F, 0.0F, 8.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.4F, 3.0F, -4.5F, 0.0F, 0.0F, -3.1416F));

		PartDefinition Bodyfrontslope = Bodyfront.addOrReplaceChild("Bodyfrontslope", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -6.0F, -0.5F, 0.3044F, 0.0F, 0.0F));

		PartDefinition Bodyfrontslope_r1 = Bodyfrontslope.addOrReplaceChild("Bodyfrontslope_r1", CubeListBuilder.create().texOffs(17, 104).addBox(0.0F, -3.0F, -4.5F, 0.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, 3.0F, -4.5F, 0.0F, 0.0F, -3.1416F));

		PartDefinition Bigdorsalspinebase = Bodyfrontslope.addOrReplaceChild("Bigdorsalspinebase", CubeListBuilder.create().texOffs(0, 34).addBox(-1.4F, 0.0F, 0.0F, 2.0F, 3.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.8F, 0.0F, -6.0F, 0.4705F, 0.0F, 0.0F));

		PartDefinition Bigdorsalspineend = Bigdorsalspinebase.addOrReplaceChild("Bigdorsalspineend", CubeListBuilder.create().texOffs(0, 56).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 15.0F, -0.1485F, 0.0F, 0.0F));

		PartDefinition Dorsalspineserrations = Bigdorsalspineend.addOrReplaceChild("Dorsalspineserrations", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.7F, 0.7F, 0.0424F, 0.0F, 0.0F));

		PartDefinition Dorsalspineserrations_r1 = Dorsalspineserrations.addOrReplaceChild("Dorsalspineserrations_r1", CubeListBuilder.create().texOffs(15, 81).addBox(0.0F, -0.5F, -5.5F, 0.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 0.5F, 5.5F, 0.0F, 0.0F, -3.1416F));

		PartDefinition Head = Bodyfront.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, 1.9F, -9.1F, -0.1958F, 0.0F, 0.0F));

		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(30, 56).addBox(0.0F, -3.5F, -3.0F, 0.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, 1.5F, -2.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition Headfront = Head.addOrReplaceChild("Headfront", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, -3.4F, -5.0F, 0.4458F, 0.0F, 0.0F));

		PartDefinition Headfront_r1 = Headfront.addOrReplaceChild("Headfront_r1", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -1.5F, -1.5F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, 2.5F, -5.5F, 0.0F, 0.0F, -3.1416F));

		PartDefinition Headfront_r2 = Headfront.addOrReplaceChild("Headfront_r2", CubeListBuilder.create().texOffs(0, 34).addBox(0.0F, -2.5F, -3.5F, 0.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.6F, 2.5F, -3.5F, 0.0F, 0.0F, -3.1416F));

		PartDefinition Nose = Headfront.addOrReplaceChild("Nose", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -6.6F, 0.2546F, 0.0F, 0.0F));

		PartDefinition Nose_r1 = Nose.addOrReplaceChild("Nose_r1", CubeListBuilder.create().texOffs(10, 0).addBox(0.0F, -2.0F, -1.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.7F, 2.0F, -1.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition Upperjaw = Headfront.addOrReplaceChild("Upperjaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, 4.7F, -7.0F, -0.2759F, 0.0F, 0.0F));

		PartDefinition Upperjaw_r1 = Upperjaw.addOrReplaceChild("Upperjaw_r1", CubeListBuilder.create().texOffs(16, 61).addBox(0.0F, -0.5F, -2.5F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.7F, -0.5F, 2.5F, 0.0F, 0.0F, -3.1416F));

		PartDefinition Headslope = Head.addOrReplaceChild("Headslope", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -5.35F, 0.4F, 0.3484F, 0.0F, 0.0F));

		PartDefinition Headslope_r1 = Headslope.addOrReplaceChild("Headslope_r1", CubeListBuilder.create().texOffs(0, 56).addBox(0.0F, -2.0F, -3.0F, 0.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.6F, 2.0F, -3.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition Lowerjaw = Head.addOrReplaceChild("Lowerjaw", CubeListBuilder.create(), PartPose.offset(0.01F, 4.1F, -1.5F));

		PartDefinition Lowerjaw_r1 = Lowerjaw.addOrReplaceChild("Lowerjaw_r1", CubeListBuilder.create().texOffs(27, 81).addBox(0.0F, -1.0F, -4.0F, 0.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.8F, 0.0F, -4.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition Bodymiddle = Bodyfront.addOrReplaceChild("Bodymiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, -1.9F, -1.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r1 = Bodymiddle.addOrReplaceChild("Bodymiddle_r1", CubeListBuilder.create().texOffs(0, 72).addBox(0.0F, -6.5F, -3.5F, 0.0F, 13.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.3F, 2.5F, 3.5F, 0.0F, 0.0F, -3.1416F));

		PartDefinition Bodyend = Bodymiddle.addOrReplaceChild("Bodyend", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.9F, 6.0F, 0.1522F, 0.0F, 0.0F));

		PartDefinition Bodyend_r1 = Bodyend.addOrReplaceChild("Bodyend_r1", CubeListBuilder.create().texOffs(20, 63).addBox(0.0F, -4.0F, -4.5F, 0.0F, 8.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.4F, 2.0F, 4.5F, 0.0F, 0.0F, -3.1416F));

		PartDefinition Bodyendslope = Bodyend.addOrReplaceChild("Bodyendslope", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -6.9F, 0.5F, -0.2759F, 0.0F, 0.0F));

		PartDefinition Bodyendslope_r1 = Bodyendslope.addOrReplaceChild("Bodyendslope_r1", CubeListBuilder.create().texOffs(27, 111).addBox(0.0F, -2.5F, -4.5F, 0.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, 2.5F, 4.5F, 0.0F, 0.0F, -3.1416F));

		PartDefinition Tailbase = Bodyend.addOrReplaceChild("Tailbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.0F, 8.0F, 0.2819F, 0.0F, 0.0F));

		PartDefinition Tailbase_r1 = Tailbase.addOrReplaceChild("Tailbase_r1", CubeListBuilder.create().texOffs(112, 0).addBox(0.0F, -3.0F, -4.0F, 0.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, 0.0F, 4.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition Tailbaseslope = Tailbase.addOrReplaceChild("Tailbaseslope", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -7.7F, 0.6F, -0.3908F, 0.0F, 0.0F));

		PartDefinition Tailbaseslope_r1 = Tailbaseslope.addOrReplaceChild("Tailbaseslope_r1", CubeListBuilder.create().texOffs(108, 104).addBox(0.0F, -2.5F, -4.5F, 0.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.6F, 2.5F, 4.5F, 0.0F, 0.0F, -3.1416F));

		PartDefinition Seconddorsalfin = Tailbaseslope.addOrReplaceChild("Seconddorsalfin", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.7F, 0.0F, -0.5F, 0.9976F, 0.0F, 0.0F));

		PartDefinition Seconddorsalfin_r1 = Seconddorsalfin.addOrReplaceChild("Seconddorsalfin_r1", CubeListBuilder.create().texOffs(31, 24).addBox(0.0F, -4.5F, -5.0F, 0.0F, 9.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.5F, 5.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition Tailmiddle = Tailbase.addOrReplaceChild("Tailmiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, -2.4F, 7.5F, 0.0908F, 0.0F, 0.0F));

		PartDefinition Tailmiddle_r1 = Tailmiddle.addOrReplaceChild("Tailmiddle_r1", CubeListBuilder.create().texOffs(42, 18).addBox(0.0F, -3.5F, -2.0F, 0.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.6F, 1.5F, 2.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition Tailend = Tailmiddle.addOrReplaceChild("Tailend", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, 3.5F, 0.4753F, 0.0F, 0.0F));

		PartDefinition Tailend_r1 = Tailend.addOrReplaceChild("Tailend_r1", CubeListBuilder.create().texOffs(21, 0).addBox(0.0F, -1.0F, -7.5F, 0.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, 0.0F, 7.5F, 0.0F, 0.0F, -3.1416F));

		PartDefinition Tailfin = Tailend.addOrReplaceChild("Tailfin", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.0F, -1.0F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Tailfin_r1 = Tailfin.addOrReplaceChild("Tailfin_r1", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -6.5F, -10.0F, 0.0F, 13.0F, 20.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.8F, 6.5F, 10.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition Analfin = Tailbase.addOrReplaceChild("Analfin", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.0F, 3.0F, 3.5F, 0.4245F, 0.0F, 0.0F));

		PartDefinition Analfin_r1 = Analfin.addOrReplaceChild("Analfin_r1", CubeListBuilder.create().texOffs(37, 0).addBox(0.0F, -3.5F, -3.0F, 0.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.5F, 3.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition Rightpelvicfin = Bodyend.addOrReplaceChild("Rightpelvicfin", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.5F, 6.0F, 4.0F, 0.48F, 0.0F, 0.0F));

		PartDefinition Rightpelvicfin_r1 = Rightpelvicfin.addOrReplaceChild("Rightpelvicfin_r1", CubeListBuilder.create().texOffs(21, 0).addBox(0.2F, -3.5F, -3.5F, 0.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.5F, 3.5F, 0.0F, 3.1416F, 0.0F));

		PartDefinition Firstdorsalfin = Bodymiddle.addOrReplaceChild("Firstdorsalfin", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.1F, -4.5F, 2.0F, -0.8915F, 0.0F, 0.0F));

		PartDefinition Firstdorsalfin_r1 = Firstdorsalfin.addOrReplaceChild("Firstdorsalfin_r1", CubeListBuilder.create().texOffs(0, 104).addBox(0.0F, -4.5F, -4.0F, 0.0F, 9.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, -3.5F, 4.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition Bellyspines = Bodymiddle.addOrReplaceChild("Bellyspines", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.5F, -0.8F, 0.0424F, 0.0F, 0.0F));

		PartDefinition Bellyspines_r1 = Bellyspines.addOrReplaceChild("Bellyspines_r1", CubeListBuilder.create().texOffs(20, 35).addBox(0.0F, -1.5F, -4.5F, 0.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.6F, 1.5F, 4.5F, 0.0F, 0.0F, -3.1416F));

		PartDefinition Leftpectoralspinebase = Bodyfront.addOrReplaceChild("Leftpectoralspinebase", CubeListBuilder.create().texOffs(16, 56).addBox(-5.0F, -1.2F, 0.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.3F, 22.4F, -16.0F, -3.1416F, 0.5672F, 1.5708F));

		PartDefinition Leftpectoralspineend = Leftpectoralspinebase.addOrReplaceChild("Leftpectoralspineend", CubeListBuilder.create().texOffs(0, 93).addBox(-6.0F, -0.5F, 0.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, 0.0F, 0.1F, 0.0F, 0.1911F, 0.0F));

		PartDefinition Rightpectoralspinebase = Bodyfront.addOrReplaceChild("Rightpectoralspinebase", CubeListBuilder.create().texOffs(37, 46).addBox(0.0F, -0.7F, 0.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.8F, 6.0F, -8.0F, 0.0F, -0.7418F, 1.5708F));

		PartDefinition Rightpectoralspineend = Rightpectoralspinebase.addOrReplaceChild("Rightpectoralspineend", CubeListBuilder.create().texOffs(15, 94).addBox(0.0F, -0.5F, 0.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, 0.0F, 0.1F, 0.0F, -0.1911F, 0.0F));

		return LayerDefinition.create(meshdefinition, 240, 170);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		fossil.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public void setupAnim(float p_170950_, float p_170951_, float p_170952_) {		
		this.fossil.yRot = p_170951_ * ((float)Math.PI / 180F) + 1.5708F;
	}
}